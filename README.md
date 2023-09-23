# Eliminatorias API
Rest API for FIFA World Cup Qualification.

### Endpoints


### Teams

| Path                     | Method | Type     | Description                                                                                           |
|:-------------------------|:-------|:---------|:------------------------------------------------------------------------------------------------------|
| `/api/v1/equipos`        | GET    |          | Request all teams on the DB.                                                                          |
| `/api/v1/equipos/{id}`   | GET    | `int`    | Id of item to fetch.                                                                                  |
| `/api/v1/equipos`        | POST   |          | **Required** An body in JSON format.                                                                  |
| `/api/v1/equipos/{id}`   | PUT    | `int`    | Id of item to update. **Required** An body in JSON format.                                            |
| `/api/v1/equipos/{id}`   | DELETE | `int`    | Id of item to delete.                                                                                 |
| `/api/v1/equipos/search` | GET    | `string` | Providing ?nombre=parameter, the path request all teams that has the submitted parameter in "nombre". |

### Matches
| Path                    | Method | Type  | Description                                                |
|:------------------------|:-------|:------|:-----------------------------------------------------------|
| `/api/v1/partidos`      | GET    |       | Request all teams on the DB.                               |
| `/api/v1/partidos/{id}` | GET    | `int` | Id of item to fetch.                                       |
| `/api/v1/partidos`      | POST   |       | **Required** An body in JSON format.                       |
| `/api/v1/partidos/{id}` | PUT    | `int` | Id of item to update. **Required** An body in JSON format. |
| `/api/v1/partidos/{id}` | DELETE | `int` | Id of item to delete.                                      |

### Results
| Path                      | Method | Type  | Description                                                |
|:--------------------------|:-------|:------|:-----------------------------------------------------------|
| `/api/v1/resultados`      | POST   |       | **Required** An body in JSON format.                       |
| `/api/v1/resultados/{id}` | PUT    | `int` | Id of item to update. **Required** An body in JSON format. |

