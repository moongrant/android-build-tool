package com.google.protobuf;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo {
    public static final String OooO00o(String str) {
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

    public static final void OooO0O0(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                OooO0O0(sb, i, str, it.next());
            }
            return;
        }
        sb.append('\n');
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(o0O0O00.OooO00o(ByteString.OooO0O0((String) obj)));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(o0O0O00.OooO00o((ByteString) obj));
            sb.append(Typography.quote);
        } else {
            if (!(obj instanceof GeneratedMessageLite)) {
                sb.append(": ");
                sb.append(obj.toString());
                return;
            }
            sb.append(" {");
            OooO0OO((GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append("}");
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b7  */
    public static void OooO0OO(oo000o oo000oVar, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : oo000oVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String strReplaceFirst = ((String) it.next()).replaceFirst("get", "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList")) {
                String str = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                Method method2 = (Method) map.get("get" + strReplaceFirst);
                if (method2 != null) {
                    OooO0O0(sb, i, OooO00o(str), GeneratedMessageLite.invokeOrDie(method2, oo000oVar, new Object[0]));
                }
            }
            if (((Method) map2.get("set" + strReplaceFirst)) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("get");
                    sbOooO0o0.append(strReplaceFirst.substring(0, strReplaceFirst.length() - 5));
                    if (map.containsKey(sbOooO0o0.toString())) {
                    }
                }
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method3 = (Method) map.get("get" + strReplaceFirst);
                Method method4 = (Method) map.get("has" + strReplaceFirst);
                if (method3 != null) {
                    Object objInvokeOrDie = GeneratedMessageLite.invokeOrDie(method3, oo000oVar, new Object[0]);
                    if (method4 == null) {
                        if (objInvokeOrDie instanceof Boolean) {
                            zEquals = !((Boolean) objInvokeOrDie).booleanValue();
                        } else if (objInvokeOrDie instanceof Integer) {
                            if (((Integer) objInvokeOrDie).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objInvokeOrDie instanceof Float) {
                            if (((Float) objInvokeOrDie).floatValue() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objInvokeOrDie instanceof Double) {
                            if (((Double) objInvokeOrDie).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objInvokeOrDie instanceof String) {
                            zEquals = objInvokeOrDie.equals("");
                        } else if (objInvokeOrDie instanceof ByteString) {
                            zEquals = objInvokeOrDie.equals(ByteString.f19322Oooo0oO);
                        } else if (!(objInvokeOrDie instanceof oo000o) ? !((objInvokeOrDie instanceof Enum) && ((Enum) objInvokeOrDie).ordinal() == 0) : objInvokeOrDie != ((oo000o) objInvokeOrDie).getDefaultInstanceForType()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) GeneratedMessageLite.invokeOrDie(method4, oo000oVar, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        OooO0O0(sb, i, OooO00o(str2), objInvokeOrDie);
                    }
                }
            }
        }
        if (oo000oVar instanceof GeneratedMessageLite.OooO0o) {
            OooOo<GeneratedMessageLite.OooO> oooOo = ((GeneratedMessageLite.OooO0o) oo000oVar).f19342Oooo0o;
            Iterator oooO0OO = oooOo.f19374OooO0OO ? new o0OoOo0.OooO0OO(((oo0o0Oo.OooO0o) oooOo.f19372OooO00o.entrySet()).iterator()) : ((oo0o0Oo.OooO0o) oooOo.f19372OooO00o.entrySet()).iterator();
            while (oooO0OO.hasNext()) {
                Map.Entry entry = (Map.Entry) oooO0OO.next();
                OooO0O0(sb, i, o0O0O00.o0ooOOo.OooO00o(OooO00o.OooO00o.OooO0o0("["), ((GeneratedMessageLite.OooO) entry.getKey()).f19336Oooo0o, "]"), entry.getValue());
            }
        }
        o000OOo o000ooo2 = ((GeneratedMessageLite) oo000oVar).unknownFields;
        if (o000ooo2 != null) {
            for (int i2 = 0; i2 < o000ooo2.f19391OooO00o; i2++) {
                OooO0O0(sb, i, String.valueOf(o000ooo2.f19392OooO0O0[i2] >>> 3), o000ooo2.f19393OooO0OO[i2]);
            }
        }
    }
}
