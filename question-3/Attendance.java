public int moreHistoryThanMathAbsences() {
    int count = 0;
    for (CourseRecord sH : historyList) {
        for (CourseRecord sM : mathList) {
            if (sM.getStudentID().equals(sH.getStudentID())) {
                if (sH.getAbsences() > sM.getAbsences()) {
                    count++;
                }
            }
        }
    }
    return count;
}
