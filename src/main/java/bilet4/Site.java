package bilet4;

/**
 * Created by Ruslan on 10.06.2017.
 */
public class Site {
    private String name;
    private String pn;
    private String vt;
    private String sr;
    private String cht;
    private String pt;
    private String sb;
    private String vs;

    public Site(String name, String pn, String vt, String sr, String cht, String pt, String sb, String vs) {
        this.name = name;
        this.pn = pn;
        this.vt = vt;
        this.sr = sr;
        this.cht = cht;
        this.pt = pt;
        this.sb = sb;
        this.vs = vs;
    }

    public Site(String[] values) {
        this.name = values[0];
        this.pn = values[1];
        this.vt = values[2];
        this.sr = values[3];
        this.cht = values[4];
        this.pt = values[5];
        this.sb = values[6];
        this.vs = values[7];
    }

    public int getAverage(){
        int result = Integer.parseInt(pn) +
                Integer.parseInt(vt) +
                Integer.parseInt(sr) +
                Integer.parseInt(cht) +
                Integer.parseInt(pt) +
                Integer.parseInt(sb) +
                Integer.parseInt(vs);
        return result / 7;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getVt() {
        return vt;
    }

    public void setVt(String vt) {
        this.vt = vt;
    }

    public String getSr() {
        return sr;
    }

    public void setSr(String sr) {
        this.sr = sr;
    }

    public String getCht() {
        return cht;
    }

    public void setCht(String cht) {
        this.cht = cht;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getSb() {
        return sb;
    }

    public void setSb(String sb) {
        this.sb = sb;
    }

    public String getVs() {
        return vs;
    }

    public void setVs(String vs) {
        this.vs = vs;
    }
}
