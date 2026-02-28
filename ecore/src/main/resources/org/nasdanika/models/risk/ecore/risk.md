
An [Ecore](https://eclipse.dev/modeling/emf/) model of the risk management/assessment problem domain ([Wikipedia: Risk assessment](https://en.wikipedia.org/wiki/Risk_assessment)) as applied to digital product development.

```drawio-resource
risk.drawio
```

## Purpose

The model serves two primary purposes:

1. **Shared Ontology / Dictionary** — Provides a canonical vocabulary for risk management terminology within the organization (risk categories, risk levels, control types, etc.).
2. **Agentic Risk Assessments** — Supports automated, agent-driven risk assessments: populate the model from multiple source systems, perform an assessment, store results, and act on changes (e.g., update data sources, create Jira work items).

## Domain Overview

Bank digital products must be assigned risk scores/ratings that are reviewed periodically or when a change is detected in source data. The lifecycle is:

1. **Product Onboarding** — Product management creates an initial entry for a new product/application. High-level information is captured along with applicable questionnaire responses (cloud usage, AI adoption, data classification, etc.).
2. **Development** — As development proceeds, artifacts are created across multiple systems (Jira epics, code repositories, CI/CD pipelines, deployable units). Some of these artifacts are **Risk Assessable Units (RAUs)**.
3. **Assessment** — RAUs are assessed: questionnaire responses are gathered, individual scores are computed from multiple dimensions, and a consolidated rating is produced.
4. **Review** — Assessments are reviewed periodically (scheduled review cycle) or triggered by changes detected in connected data sources.
5. **Remediation** — Findings and identified risks receive treatment plans with tracked actions.

## Risk Assessable Units (RAUs)

An RAU is an entity at the right granularity for independent risk assessment:

| **Is an RAU** | **Is NOT an RAU** |
|---|---|
| Bank digital product / application | Individual source file |
| Jira Epic | Jira Story or Sub-task |
| Code repository | Individual commit |
| Deployable unit / microservice | Individual function/class |
| Database / API / AI model | Individual database table |

## Model Structure

### Enumerations

| Enumeration | Description |
|---|---|
| `DataClassification` | Public, Internal, Confidential, Restricted, TopSecret |
| `TreatmentStrategy` | Accept, Avoid, Mitigate, Transfer |
| `TreatmentStatus` | Planned, InProgress, Completed, Overdue, Cancelled |
| `ActionStatus` | Pending, InProgress, Done, Cancelled |
| `AssessmentStatus` | Draft, UnderReview, Approved, Rejected, Outdated |
| `RiskStatus` | Open, Accepted, Mitigated, Transferred, Closed |
| `ControlType` | Preventive, Detective, Corrective, Compensating |
| `ControlEffectiveness` | High, Medium, Low, NotAssessed |
| `FindingType` | Gap, Issue, Observation, Recommendation |
| `FindingStatus` | Open, Resolved, Accepted, Deferred |
| `QuestionType` | YesNo, MultipleChoice, SingleChoice, Text, Rating, Scale, Date |
| `ProductComponentType` | Repository, DeployableUnit, Epic, Database, API, ThirdPartyService, CloudService, AIModel, Integration |
| `ChangeEventType` | NewFeature, Enhancement, Deployment, SecurityVulnerability, PolicyChange, RegulationChange, ThreatIntelligence, IncidentReport, VendorChange, ArchitectureChange, ScheduledReview |
| `ArtifactType` | Issue, Epic, Repository, Pipeline, Deployment, ScanReport, Document |

### Core Classes

| Class | Description |
|---|---|
| `RiskNamespace` | Root container — holds the risk taxonomy, risk levels, control categories, questionnaires, data sources, products, and risk registers. The shared organizational risk dictionary. |
| `RiskModelElement` | Abstract base providing `id`, `name`, `description`, and `uri` for all model elements. |
| `RiskLevel` | A defined risk level (e.g., Critical, High, Medium, Low) with a numeric score and color for visualization. Used for likelihood, impact, and consolidated ratings. |
| `RiskCategory` | A node in the risk taxonomy (e.g., Cybersecurity > Data Breach). Can be nested. |
| `Risk` | A specific risk type in the catalog, with triggers, consequences, and regulatory references. |
| `ControlCategory` | A category of controls (e.g., Technical, Administrative, Physical). |
| `Control` | A risk control measure with type, effectiveness rating, owner, and evidence URL. |

### Questionnaire Classes

| Class | Description |
|---|---|
| `Questionnaire` | A versioned set of questions for risk assessment (may contain hundreds of questions). |
| `Question` | A single question with type, weight, risk category linkage, and selectable options. |
| `QuestionOption` | A selectable answer option carrying a score contribution and implied risk level. |
| `QuestionnaireResponse` | A completed questionnaire for a specific RAU with computed total score and risk level. |
| `Answer` | An individual answer to a question with computed score contribution. |

### Assessment Classes

| Class | Description |
|---|---|
| `RiskAssessment` | A time-stamped assessment with assessor, approver, status, score components, consolidated rating, and findings. |
| `ScoreComponent` | A single scored dimension within an assessment (e.g., questionnaire score, SAST scan result). |
| `IdentifiedRisk` | A specific risk found in a RAU with inherent/residual scores, owner, and treatment plan. |
| `RiskTreatment` | A treatment plan (Accept/Avoid/Mitigate/Transfer) with target date and actions. |
| `TreatmentAction` | A specific action step with assignee, due date, status, and ticket URL. |
| `Finding` | An observation, gap, issue, or recommendation from an assessment. |

### RAU Classes

| Class | Description |
|---|---|
| `RiskAssessableUnit` | Abstract base for all RAUs — holds identified risks, controls, questionnaire responses, assessments, artifacts, and change events. |
| `Product` | A bank digital product (top-level RAU) with business line, team, technology stack, cloud/AI flags, and regulatory scope. |
| `ProductComponent` | A product sub-component that is independently assessable (Epic, Repository, DeployableUnit, etc.). |

### Data Source Classes

| Class | Description |
|---|---|
| `DataSource` | An external system (Jira, GitHub, SonarQube, etc.) providing risk-relevant data. |
| `Artifact` | An artifact in a data source (issue, repository, deployment, scan report). |
| `ChangeEvent` | A detected change that may trigger re-assessment (vulnerability, policy change, new deployment). |

### Register Classes

| Class | Description |
|---|---|
| `RiskRegister` | Consolidated view of identified risks across multiple RAUs for management reporting. |
| `RiskRegisterEntry` | Links an identified risk to its RAU in the risk register. |

## Maven Coordinates

```xml
<dependency>
    <groupId>org.nasdanika.models.risk</groupId>
    <artifactId>model</artifactId>
    <version>2025.12.0</version>
</dependency>
```

## Related Resources

- [Wikipedia: Risk assessment](https://en.wikipedia.org/wiki/Risk_assessment)
- [NIST Risk Management Framework](https://csrc.nist.gov/projects/risk-management)
- [FFIEC Cybersecurity Assessment Tool](https://www.ffiec.gov/cyberassessmenttool.htm)
- [Nasdanika Models](https://github.com/Nasdanika-Models)
