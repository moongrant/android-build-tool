package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.internal.measurement.zzke;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzmo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.text.Typography;
import p042Ooooo0o.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00o00 {
    public static final void OooO00o(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                OooO00o(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                OooO00o(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(o000O0O0.OooO0Oo(zzjd.zzm((String) obj)));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzjd) {
            sb.append(": \"");
            sb.append(o000O0O0.OooO0Oo((zzjd) obj));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzke) {
            sb.append(" {");
            OooO0OO((zzke) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        OooO00o(sb, i4, "key", entry.getKey());
        OooO00o(sb, i4, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    public static final String OooO0O0(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static void OooO0OO(zzll zzllVar, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzllVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strConcat = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 4)));
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    OooO00o(sb, i, OooO0O0(strConcat), zzke.OooO0o(method2, zzllVar, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strConcat2 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 3)));
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    OooO00o(sb, i, OooO0O0(strConcat2), zzke.OooO0o(method3, zzllVar, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strSubstring))) != null && (!strSubstring.endsWith("Bytes") || !map.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                String strConcat3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1)));
                Method method4 = (Method) map.get("get".concat(strSubstring));
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objOooO0o = zzke.OooO0o(method4, zzllVar, new Object[0]);
                    if (method5 == null) {
                        if (objOooO0o instanceof Boolean) {
                            if (((Boolean) objOooO0o).booleanValue()) {
                                OooO00o(sb, i, OooO0O0(strConcat3), objOooO0o);
                            }
                        } else if (objOooO0o instanceof Integer) {
                            if (((Integer) objOooO0o).intValue() != 0) {
                                OooO00o(sb, i, OooO0O0(strConcat3), objOooO0o);
                            }
                        } else if (objOooO0o instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objOooO0o).floatValue()) != 0) {
                                OooO00o(sb, i, OooO0O0(strConcat3), objOooO0o);
                            }
                        } else if (!(objOooO0o instanceof Double)) {
                            if (objOooO0o instanceof String) {
                                zEquals = objOooO0o.equals("");
                            } else if (objOooO0o instanceof zzjd) {
                                zEquals = objOooO0o.equals(zzjd.zzb);
                            } else if (objOooO0o instanceof zzll) {
                                if (objOooO0o != ((zzll) objOooO0o).zzbO()) {
                                    OooO00o(sb, i, OooO0O0(strConcat3), objOooO0o);
                                }
                            } else if (!(objOooO0o instanceof Enum) || ((Enum) objOooO0o).ordinal() != 0) {
                                OooO00o(sb, i, OooO0O0(strConcat3), objOooO0o);
                            }
                            if (!zEquals) {
                                OooO00o(sb, i, OooO0O0(strConcat3), objOooO0o);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objOooO0o).doubleValue()) != 0) {
                            OooO00o(sb, i, OooO0O0(strConcat3), objOooO0o);
                        }
                    } else if (((Boolean) zzke.OooO0o(method5, zzllVar, new Object[0])).booleanValue()) {
                        OooO00o(sb, i, OooO0O0(strConcat3), objOooO0o);
                    }
                }
            }
        }
        if (zzllVar instanceof zzkb) {
            throw null;
        }
        zzmo zzmoVar = ((zzke) zzllVar).zzc;
        if (zzmoVar != null) {
            for (int i2 = 0; i2 < zzmoVar.f15989OooO00o; i2++) {
                OooO00o(sb, i, String.valueOf(zzmoVar.f15990OooO0O0[i2] >>> 3), zzmoVar.f15991OooO0OO[i2]);
            }
        }
    }
}
