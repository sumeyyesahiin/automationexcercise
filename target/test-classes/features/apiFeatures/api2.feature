Feature:
  Scenario:
    Given sum gerekli path params ayarlari yapar
    And code ve response mesaji icin request gonderir response alir
    Then code api ile dogrulanir
    Then message api ile verify edilir.
