package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0OOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f15162OooO00o;

    static {
        char[] cArr = new char[80];
        f15162OooO00o = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void OooO00o(StringBuilder sb, int i, String str, Object obj) {
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
        OooO0O0(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(com.android.billingclient.api.o0000O00.OooO00o(new o0O0o(((String) obj).getBytes(zzlj.f15277OooO00o))));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzka) {
            sb.append(": \"");
            sb.append(com.android.billingclient.api.o0000O00.OooO00o((zzka) obj));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzlb) {
            sb.append(" {");
            OooO0OO((zzlb) obj, sb, i + 2);
            sb.append("\n");
            OooO0O0(i, sb);
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
        int i3 = i + 2;
        OooO00o(sb, i3, "key", entry.getKey());
        OooO00o(sb, i3, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
        sb.append("\n");
        OooO0O0(i, sb);
        sb.append("}");
    }

    public static void OooO0O0(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f15162OooO00o, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fb  */
    public static void OooO0OO(zzmi zzmiVar, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzmiVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                OooO00o(sb, i, strSubstring.substring(0, strSubstring.length() - 4), zzlb.OooO0oO(method2, zzmiVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                OooO00o(sb, i, strSubstring.substring(0, strSubstring.length() - 3), zzlb.OooO0oO(method, zzmiVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objOooO0oO = zzlb.OooO0oO(method4, zzmiVar, new Object[0]);
                    if (method5 == null) {
                        if (objOooO0oO instanceof Boolean) {
                            if (((Boolean) objOooO0oO).booleanValue()) {
                                OooO00o(sb, i, strSubstring, objOooO0oO);
                            }
                        } else if (objOooO0oO instanceof Integer) {
                            if (((Integer) objOooO0oO).intValue() != 0) {
                                OooO00o(sb, i, strSubstring, objOooO0oO);
                            }
                        } else if (objOooO0oO instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objOooO0oO).floatValue()) != 0) {
                                OooO00o(sb, i, strSubstring, objOooO0oO);
                            }
                        } else if (!(objOooO0oO instanceof Double)) {
                            if (objOooO0oO instanceof String) {
                                zEquals = objOooO0oO.equals("");
                            } else if (objOooO0oO instanceof zzka) {
                                zEquals = objOooO0oO.equals(zzka.zzb);
                            } else if (objOooO0oO instanceof zzmi) {
                                if (objOooO0oO != ((zzmi) objOooO0oO).zzbV()) {
                                    OooO00o(sb, i, strSubstring, objOooO0oO);
                                }
                            } else if (!(objOooO0oO instanceof Enum) || ((Enum) objOooO0oO).ordinal() != 0) {
                                OooO00o(sb, i, strSubstring, objOooO0oO);
                            }
                            if (!zEquals) {
                                OooO00o(sb, i, strSubstring, objOooO0oO);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objOooO0oO).doubleValue()) != 0) {
                            OooO00o(sb, i, strSubstring, objOooO0oO);
                        }
                    } else if (((Boolean) zzlb.OooO0oO(method5, zzmiVar, new Object[0])).booleanValue()) {
                        OooO00o(sb, i, strSubstring, objOooO0oO);
                    }
                }
            }
            i2 = 3;
        }
        if (zzmiVar instanceof zzky) {
            throw null;
        }
        zznl zznlVar = ((zzlb) zzmiVar).zzc;
        if (zznlVar != null) {
            for (int i4 = 0; i4 < zznlVar.f15286OooO00o; i4++) {
                OooO00o(sb, i, String.valueOf(zznlVar.f15287OooO0O0[i4] >>> 3), zznlVar.f15288OooO0OO[i4]);
            }
        }
    }
}
