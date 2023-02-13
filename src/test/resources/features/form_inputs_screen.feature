Feature: Filling out the form
  As a pragma user of Flutter Material app, I want to fill out the form of Inputs Screen

  @Formulario1_with_autocomplete
  Scenario Outline: interaction with the first form with autocomplete
    Given the user is in Inputs Screen
    When fill out the name with the <option> suggest with <letter>
#    Then el usuario debe ver el mensaje Form is valid

    Examples:
      | option | letter |
      | first  | a      |
#      | first |b|
#      | first |c|