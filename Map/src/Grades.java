
public class Grades {
	int m_nYear1,m_nYear2,m_nYear3,m_nTotalYears = 3,m_nTotalSum;

	public Grades(int m_nYear1, int m_nYear2, int m_nYear3) {
		this.m_nYear1 = m_nYear1;
		this.m_nYear2 = m_nYear2;
		this.m_nYear3 = m_nYear3;
	}
	
	public int getAverage()
	{
		int  m_nTotalSum = m_nYear1+m_nYear2+m_nYear3;
		return m_nTotalSum /m_nTotalYears; 
	}
}
