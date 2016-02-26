public class pdbRecord
{
    private String type, atomname, resname,chain, mol, atype;
    private int aid, resid;
    private double xc,yc,zc,occ,beta;

    public pdbRecord()
    {
	    this("",0,"","",0.0,0.0,0.0,0.0,0.0,"","");
    }

    public pdbRecord(String t, int a, String aname, String rname, String c, int r, double x, double y, double z, double o, double b, String m, String at)
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
    
}
