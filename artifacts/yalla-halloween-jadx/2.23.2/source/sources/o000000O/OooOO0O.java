package o000000O;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap<String, Constructor<? extends OooO0o>> f33276OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap<Integer, ArrayList<OooO0o>> f33277OooO00o = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends OooO0o>> map = new HashMap<>();
        f33276OooO0O0 = map;
        try {
            map.put("KeyAttribute", OooO.class.getConstructor(new Class[0]));
            map.put("KeyPosition", OooOOO0.class.getConstructor(new Class[0]));
            map.put("KeyCycle", OooOO0.class.getConstructor(new Class[0]));
            map.put("KeyTimeCycle", OooOOOO.class.getConstructor(new Class[0]));
            map.put("KeyTrigger", OooOo00.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public OooOO0O() {
    }

    public final void OooO00o(Oooo0 oooo0) {
        Integer numValueOf = Integer.valueOf(oooo0.f33348OooO0OO);
        HashMap<Integer, ArrayList<OooO0o>> map = this.f33277OooO00o;
        ArrayList<OooO0o> arrayList = map.get(numValueOf);
        if (arrayList != null) {
            oooo0.f33368OooOo0o.addAll(arrayList);
        }
        ArrayList<OooO0o> arrayList2 = map.get(-1);
        if (arrayList2 != null) {
            for (OooO0o oooO0o : arrayList2) {
                String str = ((ConstraintLayout.LayoutParams) oooo0.f33347OooO0O0.getLayoutParams()).f4977OoooOo0;
                String str2 = oooO0o.f33254OooO0OO;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    oooo0.OooO00o(oooO0o);
                }
            }
        }
    }

    public final void OooO0O0(OooO0o oooO0o) {
        Integer numValueOf = Integer.valueOf(oooO0o.f33253OooO0O0);
        HashMap<Integer, ArrayList<OooO0o>> map = this.f33277OooO00o;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(oooO0o.f33253OooO0O0), new ArrayList<>());
        }
        ArrayList<OooO0o> arrayList = map.get(Integer.valueOf(oooO0o.f33253OooO0O0));
        if (arrayList != null) {
            arrayList.add(oooO0o);
        }
    }

    public OooOO0O(Context context, XmlResourceParser xmlResourceParser) {
        Exception e;
        OooO0o oooO0oNewInstance;
        HashMap<String, ConstraintAttribute> map;
        HashMap<String, ConstraintAttribute> map2;
        try {
            int eventType = xmlResourceParser.getEventType();
            OooO0o oooO0o = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    HashMap<String, Constructor<? extends OooO0o>> map3 = f33276OooO0O0;
                    if (map3.containsKey(name)) {
                        try {
                            Constructor<? extends OooO0o> constructor = map3.get(name);
                            if (constructor != null) {
                                oooO0oNewInstance = constructor.newInstance(new Object[0]);
                                try {
                                    oooO0oNewInstance.OooO0o0(context, Xml.asAttributeSet(xmlResourceParser));
                                    OooO0O0(oooO0oNewInstance);
                                } catch (Exception e2) {
                                    e = e2;
                                    Log.e("KeyFrames", "unable to create ", e);
                                }
                                oooO0o = oooO0oNewInstance;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                        } catch (Exception e3) {
                            OooO0o oooO0o2 = oooO0o;
                            e = e3;
                            oooO0oNewInstance = oooO0o2;
                        }
                        Log.e("KeyFrames", "unable to create ", e);
                        oooO0o = oooO0oNewInstance;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (oooO0o != null && (map2 = oooO0o.f33255OooO0Oo) != null) {
                            ConstraintAttribute.OooO0Oo(context, xmlResourceParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && oooO0o != null && (map = oooO0o.f33255OooO0Oo) != null) {
                        ConstraintAttribute.OooO0Oo(context, xmlResourceParser, map);
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }
}
