Feature: Create and update a user in Todo.ly

  Scenario: create and update the user

    Given uso autentificacion none
    When uso request POSTH al enlace /api/user.json con el json
    """
    {
    "Email":"erick777@gmail.com",
    "FullName":"Luciano Paniagua",
    "Password":"12345"
    }
    """
    Then recivo una respuesta 200
    And verifico que el body de respuesta sea
    """
    {
    "Id": "IGNORE",
    "Email": "erick777@gmail.com",
    "Password": null,
    "FullName": "Luciano Paniagua",
    "TimeZone": 0,
    "IsProUser": false,
    "DefaultProjectId": "IGNORE",
    "AddItemMoreExpanded": false,
    "EditDueDateMoreExpanded": false,
    "ListSortType": 0,
    "FirstDayOfWeek": 0,
    "NewTaskDueDate": -1,
    "TimeZoneId": "Pacific Standard Time"
    }
    """
    When actualizo con el link /api/user.json con el usuario erick777@gmail.com y password 12345 con el json
    """
    {
      "FullName": "Luciano Paniagua Updated"
    }
    """
    Then recivo una respuesta 200
