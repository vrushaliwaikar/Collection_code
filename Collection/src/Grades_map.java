
public class Grades_map {
	int m_nYear1,m_nYear2,m_nYear3,m_nTotals=3,m_nTotalSum;
	
	public Grades_map(int year1,int year2,int year3)
	{
	m_nYear1=year1;
	m_nYear2=year2;
	m_nYear3=year3;
	
	}
	public int getAverage(){
		int m_nTotalSum=m_nYear1+m_nYear2+m_nYear3;
		return m_nTotalSum/m_nTotals;
	}
}
