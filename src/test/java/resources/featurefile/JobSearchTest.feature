Feature: Job Search Test
  As a user i am on cv library home page and perform job search action

  Scenario Outline:User should verify job search result using different data set
    Given I am on home page of CV Library
    When I enter job title "<jobTitle>"
    And I enter Job location "<location>"
    And I enter distance "<distance>"
    And I click on more search option
    And I enter minimum salary "<minSalary>"
    And I enter maximum salary "<maxSalary>"
    And I select salary type "<salaryType>"
    And I select job type "<jobType>"
    And I click on find jobs button
    Then I verify result "<result>"

    Examples:
      | jobTitle        | location | distance      | minSalary | maxSalary | salaryType | jobType   | result                                               |
      | Tester          | Harrow   | up to 5 miles | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill          |
      | Sales           | Swindon  | up to 5 miles | 30000     | 500000    | Per annum  | Permanent | Permanent Sales jobs in Swindon                      |
      | Test Manger     | Harrow   | up to 5 miles | 30000     | 500000    | Per annum  | Permanent | Permanent Test Manager jobs in Harrow on the Hill    |
      | Test Engineer   | Harrow   | up to 5 miles | 30000     | 500000    | Per annum  | Permanent | Permanent Test Engineer jobs in Harrow on the Hill   |
      | Test Manger     | Harrow   | up to 5 miles | 40000     | 500000    | Per annum  | Permanent | Permanent Test Manager jobs in Harrow on the Hill    |
      | Test Analyst    | Harrow   | up to 5 miles | 30000     | 800000    | Per annum  | Permanent | Permanent Test Analyst jobs in Harrow on the Hill    |
      | Test Technician | Harrow   | up to 5 miles | 20000     | 50000     | Per annum  | Permanent | Permanent Test Technician jobs in Harrow on the Hill |