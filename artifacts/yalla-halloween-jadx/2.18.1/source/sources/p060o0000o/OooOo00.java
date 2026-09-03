package p060o0000o;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static HashMap<String, Constructor<? extends OooOOO0>> f27719OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public HashMap<Integer, ArrayList<OooOOO0>> f27720OooO00o = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends OooOOO0>> map = new HashMap<>();
        f27719OooO0O0 = map;
        try {
            map.put("KeyAttribute", OooOOO.class.getConstructor(new Class[0]));
            f27719OooO0O0.put("KeyPosition", OooOo.class.getConstructor(new Class[0]));
            f27719OooO0O0.put("KeyCycle", OooOOOO.class.getConstructor(new Class[0]));
            f27719OooO0O0.put("KeyTimeCycle", Oooo0.class.getConstructor(new Class[0]));
            f27719OooO0O0.put("KeyTrigger", o000oOoO.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public OooOo00() {
    }

    public final void OooO00o(o00Oo0 o00oo1) {
        ArrayList<OooOOO0> arrayList = this.f27720OooO00o.get(-1);
        if (arrayList != null) {
            o00oo1.f27784OooOo0o.addAll(arrayList);
        }
    }

    public final void OooO0O0(o00Oo0 o00oo1) {
        ArrayList<OooOOO0> arrayList = this.f27720OooO00o.get(Integer.valueOf(o00oo1.f27764OooO0OO));
        if (arrayList != null) {
            o00oo1.f27784OooOo0o.addAll(arrayList);
        }
        ArrayList<OooOOO0> arrayList2 = this.f27720OooO00o.get(-1);
        if (arrayList2 != null) {
            for (OooOOO0 oooOOO0 : arrayList2) {
                String str = ((ConstraintLayout.LayoutParams) o00oo1.f27763OooO0O0.getLayoutParams()).f7546OoooOo0;
                String str2 = oooOOO0.f27686OooO0OO;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    o00oo1.OooO00o(oooOOO0);
                }
            }
        }
    }

    public final void OooO0OO(OooOOO0 oooOOO0) {
        if (!this.f27720OooO00o.containsKey(Integer.valueOf(oooOOO0.f27685OooO0O0))) {
            this.f27720OooO00o.put(Integer.valueOf(oooOOO0.f27685OooO0O0), new ArrayList<>());
        }
        ArrayList<OooOOO0> arrayList = this.f27720OooO00o.get(Integer.valueOf(oooOOO0.f27685OooO0O0));
        if (arrayList != null) {
            arrayList.add(oooOOO0);
        }
    }

    public OooOo00(Context context, XmlPullParser xmlPullParser) {
        Exception e;
        OooOOO0 oooOOO0NewInstance;
        HashMap<String, ConstraintAttribute> map;
        HashMap<String, ConstraintAttribute> map2;
        try {
            int eventType = xmlPullParser.getEventType();
            OooOOO0 oooOOO0 = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (f27719OooO0O0.containsKey(name)) {
                        try {
                            Constructor<? extends OooOOO0> constructor = f27719OooO0O0.get(name);
                            if (constructor != null) {
                                oooOOO0NewInstance = constructor.newInstance(new Object[0]);
                                try {
                                    oooOOO0NewInstance.OooO0o0(context, Xml.asAttributeSet(xmlPullParser));
                                    OooO0OO(oooOOO0NewInstance);
                                } catch (Exception e2) {
                                    e = e2;
                                    Log.e("KeyFrames", "unable to create ", e);
                                }
                                oooOOO0 = oooOOO0NewInstance;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                        } catch (Exception e3) {
                            OooOOO0 oooOOO1 = oooOOO0;
                            e = e3;
                            oooOOO0NewInstance = oooOOO1;
                        }
                        Log.e("KeyFrames", "unable to create ", e);
                        oooOOO0 = oooOOO0NewInstance;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (oooOOO0 != null && (map2 = oooOOO0.f27687OooO0Oo) != null) {
                            ConstraintAttribute.OooO0o0(context, xmlPullParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && oooOOO0 != null && (map = oooOOO0.f27687OooO0Oo) != null) {
                        ConstraintAttribute.OooO0o0(context, xmlPullParser, map);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }
}
