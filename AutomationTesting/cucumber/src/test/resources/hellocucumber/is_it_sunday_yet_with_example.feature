Feature: Is it Sunday yet?
  Everybody wants to know when it's Sunday

  Scenario Outline: Today is or is not Sunday
    Given today is "<day>"
    When I ask whether it's Sunday yet
    Then Tell me "<answer>"

    Examples: 
      | day           | answer |
      | Friday        | Nope   |
      | Sunday        | yes    |
      | anything else | Nope   |
