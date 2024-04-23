package org.example;

import org.scilab.forge.jlatexmath.*;

public class Visualizar {
  private TeXFormula formula;
  private TeXIcon icon;
  private String math;

  public Visualizar(String math) {
    this.math = math;
  }

  public TeXIcon getFormula() {
    this.formula = new TeXFormula(math);
    this.icon = formula.createTeXIcon(TeXConstants.ALIGN_LEFT, 22);
    return this.icon;
  }
}
