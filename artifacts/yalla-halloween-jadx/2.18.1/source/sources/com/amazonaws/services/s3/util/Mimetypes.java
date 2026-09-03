package com.amazonaws.services.s3.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.StringUtils;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.util.HashMap;
import p060o0000o.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class Mimetypes {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Log f11144OooO0O0 = LogFactory.OooO00o(Mimetypes.class);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static Mimetypes f11145OooO0OO = null;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap<String, String> f11146OooO00o;

    public Mimetypes() {
        HashMap<String, String> map = new HashMap<>();
        this.f11146OooO00o = map;
        map.put("3gp", "video/3gpp");
        map.put("ai", "application/postscript");
        map.put("aif", "audio/x-aiff");
        map.put("aifc", "audio/x-aiff");
        map.put("aiff", "audio/x-aiff");
        map.put("asc", "text/plain");
        map.put("atom", "application/atom+xml");
        map.put("au", "audio/basic");
        map.put("avi", "video/x-msvideo");
        map.put("bcpio", "application/x-bcpio");
        map.put("bin", "application/octet-stream");
        map.put("bmp", "image/bmp");
        map.put("cdf", "application/x-netcdf");
        map.put("cgm", "image/cgm");
        map.put("class", "application/octet-stream");
        map.put("cpio", "application/x-cpio");
        map.put("cpt", "application/mac-compactpro");
        map.put("csh", "application/x-csh");
        map.put("css", "text/css");
        map.put("dcr", "application/x-director");
        map.put("dif", "video/x-dv");
        map.put("dir", "application/x-director");
        map.put("djv", "image/vnd.djvu");
        map.put("djvu", "image/vnd.djvu");
        map.put("dll", "application/octet-stream");
        map.put("dmg", "application/octet-stream");
        map.put("dms", "application/octet-stream");
        map.put("doc", "application/msword");
        map.put("dtd", "application/xml-dtd");
        map.put("dv", "video/x-dv");
        map.put("dvi", "application/x-dvi");
        map.put("dxr", "application/x-director");
        map.put("eps", "application/postscript");
        map.put("etx", "text/x-setext");
        map.put("exe", "application/octet-stream");
        map.put("ez", "application/andrew-inset");
        map.put("flv", "video/x-flv");
        map.put("gif", "image/gif");
        map.put("gram", "application/srgs");
        map.put("grxml", "application/srgs+xml");
        map.put("gtar", "application/x-gtar");
        map.put("gz", "application/x-gzip");
        map.put("hdf", "application/x-hdf");
        map.put("hqx", "application/mac-binhex40");
        map.put("htm", "text/html");
        map.put("html", "text/html");
        map.put("ice", "x-conference/x-cooltalk");
        map.put("ico", "image/x-icon");
        map.put("ics", "text/calendar");
        map.put("ief", "image/ief");
        map.put("ifb", "text/calendar");
        map.put("iges", "model/iges");
        map.put("igs", "model/iges");
        map.put("jnlp", "application/x-java-jnlp-file");
        map.put("jp2", "image/jp2");
        map.put("jpe", "image/jpeg");
        map.put("jpeg", "image/jpeg");
        map.put("jpg", "image/jpeg");
        map.put("js", "application/x-javascript");
        map.put("kar", "audio/midi");
        map.put("latex", "application/x-latex");
        map.put("lha", "application/octet-stream");
        map.put("lzh", "application/octet-stream");
        map.put("m3u", "audio/x-mpegurl");
        map.put("m4a", "audio/mp4a-latm");
        map.put("m4p", "audio/mp4a-latm");
        map.put("m4u", "video/vnd.mpegurl");
        map.put("m4v", "video/x-m4v");
        map.put("mac", "image/x-macpaint");
        map.put("man", "application/x-troff-man");
        map.put("mathml", "application/mathml+xml");
        map.put("me", "application/x-troff-me");
        map.put("mesh", "model/mesh");
        map.put("mid", "audio/midi");
        map.put("midi", "audio/midi");
        map.put("mif", "application/vnd.mif");
        map.put("mov", "video/quicktime");
        map.put("movie", "video/x-sgi-movie");
        map.put("mp2", "audio/mpeg");
        map.put("mp3", "audio/mpeg");
        map.put("mp4", "video/mp4");
        map.put("mpe", "video/mpeg");
        map.put("mpeg", "video/mpeg");
        map.put("mpg", "video/mpeg");
        map.put("mpga", "audio/mpeg");
        map.put("ms", "application/x-troff-ms");
        map.put("msh", "model/mesh");
        map.put("mxu", "video/vnd.mpegurl");
        map.put("nc", "application/x-netcdf");
        map.put("oda", "application/oda");
        map.put("ogg", "application/ogg");
        map.put("ogv", "video/ogv");
        map.put("pbm", "image/x-portable-bitmap");
        map.put("pct", "image/pict");
        map.put("pdb", "chemical/x-pdb");
        map.put("pdf", "application/pdf");
        map.put("pgm", "image/x-portable-graymap");
        map.put("pgn", "application/x-chess-pgn");
        map.put("pic", "image/pict");
        map.put("pict", "image/pict");
        map.put("png", "image/png");
        map.put("pnm", "image/x-portable-anymap");
        map.put("pnt", "image/x-macpaint");
        map.put("pntg", "image/x-macpaint");
        map.put("ppm", "image/x-portable-pixmap");
        map.put("ppt", "application/vnd.ms-powerpoint");
        map.put("ps", "application/postscript");
        map.put("qt", "video/quicktime");
        map.put("qti", "image/x-quicktime");
        map.put("qtif", "image/x-quicktime");
        map.put("ra", "audio/x-pn-realaudio");
        map.put("ram", "audio/x-pn-realaudio");
        map.put("ras", "image/x-cmu-raster");
        map.put("rdf", "application/rdf+xml");
        map.put("rgb", "image/x-rgb");
        map.put("rm", "application/vnd.rn-realmedia");
        map.put("roff", "application/x-troff");
        map.put("rtf", "text/rtf");
        map.put("rtx", "text/richtext");
        map.put("sgm", "text/sgml");
        map.put("sgml", "text/sgml");
        map.put("sh", "application/x-sh");
        map.put("shar", "application/x-shar");
        map.put("silo", "model/mesh");
        map.put("sit", "application/x-stuffit");
        map.put("skd", "application/x-koan");
        map.put("skm", "application/x-koan");
        map.put("skp", "application/x-koan");
        map.put("skt", "application/x-koan");
        map.put("smi", "application/smil");
        map.put("smil", "application/smil");
        map.put("snd", "audio/basic");
        map.put("so", "application/octet-stream");
        map.put("spl", "application/x-futuresplash");
        map.put("src", "application/x-wais-source");
        map.put("sv4cpio", "application/x-sv4cpio");
        map.put("sv4crc", "application/x-sv4crc");
        map.put("svg", "image/svg+xml");
        map.put("swf", "application/x-shockwave-flash");
        map.put(ak.aH, "application/x-troff");
        map.put("tar", "application/x-tar");
        map.put("tcl", "application/x-tcl");
        map.put("tex", "application/x-tex");
        map.put("texi", "application/x-texinfo");
        map.put("texinfo", "application/x-texinfo");
        map.put("tif", "image/tiff");
        map.put("tiff", "image/tiff");
        map.put("tr", "application/x-troff");
        map.put("tsv", "text/tab-separated-values");
        map.put("txt", "text/plain");
        map.put("ustar", "application/x-ustar");
        map.put("vcd", "application/x-cdlink");
        map.put("vrml", "model/vrml");
        map.put("vxml", "application/voicexml+xml");
        map.put("wav", "audio/x-wav");
        map.put("wbmp", "image/vnd.wap.wbmp");
        map.put("wbxml", "application/vnd.wap.wbxml");
        map.put("webm", "video/webm");
        map.put("wml", "text/vnd.wap.wml");
        map.put("wmlc", "application/vnd.wap.wmlc");
        map.put("wmls", "text/vnd.wap.wmlscript");
        map.put("wmlsc", "application/vnd.wap.wmlscriptc");
        map.put("wmv", "video/x-ms-wmv");
        map.put("wrl", "model/vrml");
        map.put("xbm", "image/x-xbitmap");
        map.put("xht", "application/xhtml+xml");
        map.put("xhtml", "application/xhtml+xml");
        map.put("xls", "application/vnd.ms-excel");
        map.put("xml", "application/xml");
        map.put("xpm", "image/x-xpixmap");
        map.put("xsl", "application/xml");
        map.put("xslt", "application/xslt+xml");
        map.put("xul", "application/vnd.mozilla.xul+xml");
        map.put("xwd", "image/x-xwindowdump");
        map.put("xyz", "chemical/x-xyz");
        map.put("zip", "application/zip");
    }

    public static synchronized Mimetypes OooO00o() {
        Mimetypes mimetypes = f11145OooO0OO;
        if (mimetypes != null) {
            return mimetypes;
        }
        f11145OooO0OO = new Mimetypes();
        if (f11144OooO0O0.OooO0OO()) {
            HashMap<String, String> map = f11145OooO0OO.f11146OooO00o;
            for (String str : map.keySet()) {
                f11144OooO0O0.OooO00o("Setting mime type for extension '" + str + "' to '" + map.get(str) + "'");
            }
        }
        return f11145OooO0OO;
    }

    public final String OooO0O0(File file) {
        int i;
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(".");
        String str = "application/octet-stream";
        if (iLastIndexOf <= 0 || (i = iLastIndexOf + 1) >= name.length()) {
            Log log = f11144OooO0O0;
            if (log.OooO0OO()) {
                log.OooO00o("File name has no extension, mime type cannot be recognised for: " + name);
            }
        } else {
            String strOooO00o = StringUtils.OooO00o(name.substring(i));
            if (this.f11146OooO00o.containsKey(strOooO00o)) {
                str = this.f11146OooO00o.get(strOooO00o);
                Log log2 = f11144OooO0O0;
                if (log2.OooO0OO()) {
                    log2.OooO00o(oo000o.OooO00o("Recognised extension '", strOooO00o, "', mimetype is: '", str, "'"));
                }
            } else {
                Log log3 = f11144OooO0O0;
                if (log3.OooO0OO()) {
                    log3.OooO00o(oo000o.OooO00o("Extension '", strOooO00o, "' is unrecognized in mime type listing, using default mime type: '", "application/octet-stream", "'"));
                }
            }
        }
        return str;
    }
}
