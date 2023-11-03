package employee_wage;

class EmployeeWageCalculator {
        private final int wagePerHour;
        private final int fullDayHours;
        private final int partTimeHours;
        private final int workingDaysPerMonth;
        private final int workingHoursPerMonth;

        public EmployeeWageCalculator(int wagePerHour, int fullDayHours, int partTimeHours, int workingDaysPerMonth, int workingHoursPerMonth) {
            this.wagePerHour = wagePerHour;
            this.fullDayHours = fullDayHours;
            this.partTimeHours = partTimeHours;
            this.workingDaysPerMonth = workingDaysPerMonth;
            this.workingHoursPerMonth = workingHoursPerMonth;
        }
            public int calculateDailyWage() {
                int attendance = (int) (Math.random() * 2); // 0 for absent, 1 for present
                if (attendance == 1) {
                    return wagePerHour * fullDayHours;
                } else {
                    return 0;
                }
            }

            public int calculatePartTimeWage() {
                int attendance = (int) (Math.random() * 2); // 0 for absent, 1 for present
                if (attendance == 1) {
                    return wagePerHour * partTimeHours;
                } else {
                    return 0;
                }
            }

            public int calculateMonthlyWage() {
                int totalWage = 0;
                for (int day = 0; day < workingDaysPerMonth; day++) {
                    totalWage += calculateDailyWage();
                }
                return totalWage;
            }

            public int calculateWageTillCondition() {
                int totalWage = 0;
                int totalWorkingHours = 0;
                int totalWorkingDays = 0;

                while (totalWorkingHours < workingHoursPerMonth && totalWorkingDays < workingDaysPerMonth) {
                    int dailyWage = calculateDailyWage();
                    totalWage += dailyWage;
                    totalWorkingHours += fullDayHours;
                    totalWorkingDays++;
                }
                return totalWage;
            }
        }


