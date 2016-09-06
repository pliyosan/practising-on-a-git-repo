package SalarySlipKata.domain;

import static java.lang.String.valueOf;

public class EmployeeId {
  private final int id;

  public EmployeeId(int id) {this.id = id;}

  @Override
  public String toString() {
    return valueOf(id);
  }
}
