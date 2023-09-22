Feature: Filling out the form
  As a pragma user of Flutter Material app, I want to fill out the form of Inputs Screen

  @Formulario1_with_autocomplete
  Scenario Outline: interaction with the first form with autocomplete
    Given the user is in Inputs Screen
    When fill out the name with the <option> suggest with <letter>

    Examples:
      | option | letter |
      | first  | a      |



