public class pdbRecord
{
    private String type, atomname, resname,chain, mol, atype;
    private int aid, resid;
    private double xc,yc,zc,occ,beta;

//    public pdbRecord()
//    {
//	    this("",0,"","",0.0,0.0,0.0,0.0,0.0,"","");
//    }
////
    public pdbRecord(String t, int a, String aname, String rname, String c, int r, double x, double y, double z, double o, double b, String m, String at)
	{
		setRecord(t, a, aname, rname, c, r, x, y, z, o, b, m, at);
	}
	public void setRecord(String t, int a, String aname, String rname, String c, int r, double x, double y, double z, double o, double b, String m, String at)
	{
		type=t;
		aid=a;
		atomname=aname;
		resname=rname;
		chain=c;
		resid=r;
		xc=x;
		yc=y;
		zc=z;
		occ=o;
		beta=b;
		mol=m;
		atype=at;
	}
	public String getatomname()
	{
		return atomname;
	}
	public String getresname()
	{
		return resname;
	}
    public int getresid()
	{
		return resid;
	}
	public String getatype()
	{
		return atype;
	}
}
