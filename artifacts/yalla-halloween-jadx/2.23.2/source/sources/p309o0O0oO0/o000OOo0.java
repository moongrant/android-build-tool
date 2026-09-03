package p309o0O0oO0;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.util.OooO;
import com.google.firebase.perf.util.OooO0o;
import java.util.concurrent.Executors;
import p311o0O0oO0o.o0O0O00;
import p321o0O0oo0O.o000000;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O0O00 f41783OooO0Oo = o0O0O00.OooO0Oo();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static volatile o000OOo0 f41784OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RemoteConfigManager f41785OooO00o = RemoteConfigManager.getInstance();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0o f41786OooO0O0 = new OooO0o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O f41787OooO0OO;

    @VisibleForTesting
    public o000OOo0() {
        o00O o00o2;
        o0O0O00 o0o0o00 = o00O.f41788OooO0OO;
        synchronized (o00O.class) {
            if (o00O.f41789OooO0Oo == null) {
                o00O.f41789OooO0Oo = new o00O(Executors.newSingleThreadExecutor());
            }
            o00o2 = o00O.f41789OooO0Oo;
        }
        this.f41787OooO0OO = o00o2;
    }

    public static synchronized o000OOo0 OooO0o0() {
        if (f41784OooO0o0 == null) {
            f41784OooO0o0 = new o000OOo0();
        }
        return f41784OooO0o0;
    }

    public static boolean OooOOo(long j) {
        return j >= 0;
    }

    public static boolean OooOOoo(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            String strTrim = str2.trim();
            Boolean bool = o000000.f42030OooO00o;
            if (strTrim.equals("20.3.3")) {
                return true;
            }
        }
        return false;
    }

    public static boolean OooOo00(long j) {
        return j >= 0;
    }

    public static boolean OooOo0O(double d) {
        return 0.0d <= d && d <= 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a A[Catch: ClassCastException -> 0x0038, TryCatch #0 {ClassCastException -> 0x0038, blocks: (B:11:0x0020, B:13:0x002a, B:14:0x0031), top: B:20:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0031 A[Catch: ClassCastException -> 0x0038, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0038, blocks: (B:11:0x0020, B:13:0x002a, B:14:0x0031), top: B:20:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [o0O0oO0o.o0O0O00] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.firebase.perf.util.OooO<java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final OooO<Boolean> OooO(oo0oOO0<Boolean> oo0ooo0) {
        boolean z;
        Boolean bool;
        OooO0o oooO0o = this.f41786OooO0O0;
        ?? OooO0O1 = oo0ooo0.OooO0O0();
        if (OooO0O1 != 0) {
            if (oooO0o.f19993OooO00o.containsKey(OooO0O1)) {
                z = true;
            }
            if (!z) {
                return new OooO<>();
            }
            try {
                bool = (Boolean) oooO0o.f19993OooO00o.get(OooO0O1);
                if (bool == null) {
                    OooO0O1 = new OooO();
                } else {
                    OooO0O1 = new OooO(bool);
                }
                return OooO0O1;
            } catch (ClassCastException e) {
                OooO0o.f19992OooO0O0.OooO0O0("Metadata key %s contains type other than boolean: %s", new Object[]{OooO0O1, e.getMessage()});
                return new OooO<>();
            }
        }
        oooO0o.getClass();
        z = false;
        if (!z) {
            return new OooO<>();
        }
        bool = (Boolean) oooO0o.f19993OooO00o.get(OooO0O1);
        if (bool == null) {
            OooO0O1 = new OooO();
        } else {
            OooO0O1 = new OooO(bool);
        }
        return OooO0O1;
    }

    public final OooO<Boolean> OooO00o(oo0oOO0<Boolean> oo0ooo0) {
        o00O o00o2 = this.f41787OooO0OO;
        String strOooO00o = oo0ooo0.OooO00o();
        if (strOooO00o == null) {
            o00o2.getClass();
            o00O.f41788OooO0OO.OooO00o("Key is null when getting boolean value on device cache.");
            return new OooO<>();
        }
        if (o00o2.f41790OooO00o == null) {
            o00o2.OooO0O0(o00O.OooO00o());
            if (o00o2.f41790OooO00o == null) {
                return new OooO<>();
            }
        }
        if (!o00o2.f41790OooO00o.contains(strOooO00o)) {
            return new OooO<>();
        }
        try {
            return new OooO<>(Boolean.valueOf(o00o2.f41790OooO00o.getBoolean(strOooO00o, false)));
        } catch (ClassCastException e) {
            o00O.f41788OooO0OO.OooO0O0("Key %s from sharedPreferences has type other than long: %s", strOooO00o, e.getMessage());
            return new OooO<>();
        }
    }

    public final OooO<Double> OooO0O0(oo0oOO0<Double> oo0ooo0) {
        o00O o00o2 = this.f41787OooO0OO;
        String strOooO00o = oo0ooo0.OooO00o();
        if (strOooO00o == null) {
            o00o2.getClass();
            o00O.f41788OooO0OO.OooO00o("Key is null when getting double value on device cache.");
            return new OooO<>();
        }
        if (o00o2.f41790OooO00o == null) {
            o00o2.OooO0O0(o00O.OooO00o());
            if (o00o2.f41790OooO00o == null) {
                return new OooO<>();
            }
        }
        if (!o00o2.f41790OooO00o.contains(strOooO00o)) {
            return new OooO<>();
        }
        try {
            try {
                return new OooO<>(Double.valueOf(Double.longBitsToDouble(o00o2.f41790OooO00o.getLong(strOooO00o, 0L))));
            } catch (ClassCastException unused) {
                return new OooO<>(Double.valueOf(Float.valueOf(o00o2.f41790OooO00o.getFloat(strOooO00o, 0.0f)).doubleValue()));
            }
        } catch (ClassCastException e) {
            o00O.f41788OooO0OO.OooO0O0("Key %s from sharedPreferences has type other than double: %s", strOooO00o, e.getMessage());
            return new OooO<>();
        }
    }

    public final OooO<Long> OooO0OO(oo0oOO0<Long> oo0ooo0) {
        o00O o00o2 = this.f41787OooO0OO;
        String strOooO00o = oo0ooo0.OooO00o();
        if (strOooO00o == null) {
            o00o2.getClass();
            o00O.f41788OooO0OO.OooO00o("Key is null when getting long value on device cache.");
            return new OooO<>();
        }
        if (o00o2.f41790OooO00o == null) {
            o00o2.OooO0O0(o00O.OooO00o());
            if (o00o2.f41790OooO00o == null) {
                return new OooO<>();
            }
        }
        if (!o00o2.f41790OooO00o.contains(strOooO00o)) {
            return new OooO<>();
        }
        try {
            return new OooO<>(Long.valueOf(o00o2.f41790OooO00o.getLong(strOooO00o, 0L)));
        } catch (ClassCastException e) {
            o00O.f41788OooO0OO.OooO0O0("Key %s from sharedPreferences has type other than long: %s", strOooO00o, e.getMessage());
            return new OooO<>();
        }
    }

    public final OooO<String> OooO0Oo(oo0oOO0<String> oo0ooo0) {
        o00O o00o2 = this.f41787OooO0OO;
        String strOooO00o = oo0ooo0.OooO00o();
        if (strOooO00o == null) {
            o00o2.getClass();
            o00O.f41788OooO0OO.OooO00o("Key is null when getting String value on device cache.");
            return new OooO<>();
        }
        if (o00o2.f41790OooO00o == null) {
            o00o2.OooO0O0(o00O.OooO00o());
            if (o00o2.f41790OooO00o == null) {
                return new OooO<>();
            }
        }
        if (!o00o2.f41790OooO00o.contains(strOooO00o)) {
            return new OooO<>();
        }
        try {
            return new OooO<>(o00o2.f41790OooO00o.getString(strOooO00o, ""));
        } catch (ClassCastException e) {
            o00O.f41788OooO0OO.OooO0O0("Key %s from sharedPreferences has type other than String: %s", strOooO00o, e.getMessage());
            return new OooO<>();
        }
    }

    public final boolean OooO0o() {
        o0O0ooO o0o0ooo;
        synchronized (o0O0ooO.class) {
            if (o0O0ooO.f41808OooO00o == null) {
                o0O0ooO.f41808OooO00o = new o0O0ooO();
            }
            o0o0ooo = o0O0ooO.f41808OooO00o;
        }
        OooO<Boolean> OooO2 = OooO(o0o0ooo);
        if (OooO2.OooO0O0()) {
            return OooO2.OooO00o().booleanValue();
        }
        OooO<Boolean> oooO = this.f41785OooO00o.getBoolean("fpr_experiment_app_start_ttid");
        if (oooO.OooO0O0()) {
            this.f41787OooO0OO.OooO0o("com.google.firebase.perf.ExperimentTTID", oooO.OooO00o().booleanValue());
            return oooO.OooO00o().booleanValue();
        }
        OooO<Boolean> oooOOooO00o = OooO00o(o0o0ooo);
        if (oooOOooO00o.OooO0O0()) {
            return oooOOooO00o.OooO00o().booleanValue();
        }
        return false;
    }

    @Nullable
    public final Boolean OooO0oO() {
        o00 o00Var;
        synchronized (o00.class) {
            if (o00.f41782OooO00o == null) {
                o00.f41782OooO00o = new o00();
            }
            o00Var = o00.f41782OooO00o;
        }
        OooO<Boolean> OooO2 = OooO(o00Var);
        if ((OooO2.OooO0O0() ? OooO2.OooO00o() : Boolean.FALSE).booleanValue()) {
            return Boolean.FALSE;
        }
        o00O0000 o00o0000OooO0Oo = o00O0000.OooO0Oo();
        OooO<Boolean> oooOOooO00o = OooO00o(o00o0000OooO0Oo);
        if (oooOOooO00o.OooO0O0()) {
            return oooOOooO00o.OooO00o();
        }
        OooO<Boolean> OooO3 = OooO(o00o0000OooO0Oo);
        if (OooO3.OooO0O0()) {
            return OooO3.OooO00o();
        }
        return null;
    }

    public final boolean OooO0oo() {
        o00O00OO o00o00oo2;
        synchronized (o00O00OO.class) {
            if (o00O00OO.f41799OooO00o == null) {
                o00O00OO.f41799OooO00o = new o00O00OO();
            }
            o00o00oo2 = o00O00OO.f41799OooO00o;
        }
        RemoteConfigManager remoteConfigManager = this.f41785OooO00o;
        o00o00oo2.getClass();
        OooO<String> string = remoteConfigManager.getString("fpr_disabled_android_versions");
        if (string.OooO0O0()) {
            this.f41787OooO0OO.OooO0o0("com.google.firebase.perf.SdkDisabledVersions", string.OooO00o());
            return OooOOoo(string.OooO00o());
        }
        OooO<String> oooOOooO0Oo = OooO0Oo(o00o00oo2);
        return oooOOooO0Oo.OooO0O0() ? OooOOoo(oooOOooO0Oo.OooO00o()) : OooOOoo("");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    public final OooO<Double> OooOO0(oo0oOO0<Double> oo0ooo0) {
        boolean z;
        Object obj;
        OooO0o oooO0o = this.f41786OooO0O0;
        String strOooO0O0 = oo0ooo0.OooO0O0();
        if (strOooO0O0 != null) {
            if (oooO0o.f19993OooO00o.containsKey(strOooO0O0)) {
                z = true;
            }
            if (!z) {
                return new OooO<>();
            }
            obj = oooO0o.f19993OooO00o.get(strOooO0O0);
            if (obj == null) {
                return new OooO<>();
            }
            if (obj instanceof Float) {
                return new OooO<>(Double.valueOf(((Float) obj).doubleValue()));
            }
            if (obj instanceof Double) {
                return new OooO<>((Double) obj);
            }
            OooO0o.f19992OooO0O0.OooO0O0("Metadata key %s contains type other than double: %s", strOooO0O0);
            return new OooO<>();
        }
        oooO0o.getClass();
        z = false;
        if (!z) {
            return new OooO<>();
        }
        obj = oooO0o.f19993OooO00o.get(strOooO0O0);
        if (obj == null) {
            return new OooO<>();
        }
        if (obj instanceof Float) {
            return new OooO<>(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new OooO<>((Double) obj);
        }
        OooO0o.f19992OooO0O0.OooO0O0("Metadata key %s contains type other than double: %s", strOooO0O0);
        return new OooO<>();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a A[Catch: ClassCastException -> 0x0038, TryCatch #0 {ClassCastException -> 0x0038, blocks: (B:11:0x0020, B:13:0x002a, B:14:0x0031), top: B:24:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0031 A[Catch: ClassCastException -> 0x0038, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0038, blocks: (B:11:0x0020, B:13:0x002a, B:14:0x0031), top: B:24:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v14, types: [com.google.firebase.perf.util.OooO] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [o0O0oO0o.o0O0O00] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.firebase.perf.util.OooO] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.google.firebase.perf.util.OooO] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final OooO<Long> OooOO0O(oo0oOO0<Long> oo0ooo0) {
        boolean z;
        Integer num;
        OooO0o oooO0o = this.f41786OooO0O0;
        ?? OooO0O1 = oo0ooo0.OooO0O0();
        if (OooO0O1 != 0) {
            if (oooO0o.f19993OooO00o.containsKey(OooO0O1)) {
                z = true;
            }
            if (z) {
                try {
                    num = (Integer) oooO0o.f19993OooO00o.get(OooO0O1);
                    if (num == null) {
                        OooO0O1 = new OooO();
                    } else {
                        OooO0O1 = new OooO(num);
                    }
                } catch (ClassCastException e) {
                    OooO0o.f19992OooO0O0.OooO0O0("Metadata key %s contains type other than int: %s", new Object[]{OooO0O1, e.getMessage()});
                    OooO0O1 = new OooO();
                }
            } else {
                OooO0O1 = new OooO();
            }
            return OooO0O1.OooO0O0() ? new OooO<>(Long.valueOf(((Integer) OooO0O1.OooO00o()).intValue())) : new OooO<>();
        }
        oooO0o.getClass();
        z = false;
        if (z) {
            OooO0O1 = new OooO();
        } else {
            num = (Integer) oooO0o.f19993OooO00o.get(OooO0O1);
            if (num == null) {
                OooO0O1 = new OooO();
            } else {
                OooO0O1 = new OooO(num);
            }
        }
        if (OooO0O1.OooO0O0()) {
        }
    }

    public final long OooOO0o() {
        oOO00O ooo00o;
        synchronized (oOO00O.class) {
            if (oOO00O.f41809OooO00o == null) {
                oOO00O.f41809OooO00o = new oOO00O();
            }
            ooo00o = oOO00O.f41809OooO00o;
        }
        OooO<Long> oooOOooOOO0 = OooOOO0(ooo00o);
        if (oooOOooOOO0.OooO0O0()) {
            if (oooOOooOOO0.OooO00o().longValue() > 0) {
                this.f41787OooO0OO.OooO0OO(oooOOooOOO0.OooO00o().longValue(), "com.google.firebase.perf.TimeLimitSec");
                return oooOOooOOO0.OooO00o().longValue();
            }
        }
        OooO<Long> oooOOooO0OO = OooO0OO(ooo00o);
        if (oooOOooO0OO.OooO0O0()) {
            if (oooOOooO0OO.OooO00o().longValue() > 0) {
                return oooOOooO0OO.OooO00o().longValue();
            }
        }
        Long l = 600L;
        return l.longValue();
    }

    public final long OooOOO() {
        o00O0 o00o1;
        synchronized (o00O0.class) {
            if (o00O0.f41792OooO00o == null) {
                o00O0.f41792OooO00o = new o00O0();
            }
            o00o1 = o00O0.f41792OooO00o;
        }
        OooO<Long> oooOOooOO0O = OooOO0O(o00o1);
        if (oooOOooOO0O.OooO0O0() && OooOo00(oooOOooOO0O.OooO00o().longValue())) {
            return oooOOooOO0O.OooO00o().longValue();
        }
        OooO<Long> oooOOooOOO0 = OooOOO0(o00o1);
        if (oooOOooOOO0.OooO0O0() && OooOo00(oooOOooOOO0.OooO00o().longValue())) {
            this.f41787OooO0OO.OooO0OO(oooOOooOOO0.OooO00o().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
            return oooOOooOOO0.OooO00o().longValue();
        }
        OooO<Long> oooOOooO0OO = OooO0OO(o00o1);
        if (oooOOooO0OO.OooO0O0() && OooOo00(oooOOooO0OO.OooO00o().longValue())) {
            return oooOOooO0OO.OooO00o().longValue();
        }
        if (this.f41785OooO00o.isLastFetchFailed()) {
            Long l = 100L;
            return Long.valueOf(l.longValue() * 3).longValue();
        }
        Long l2 = 100L;
        return l2.longValue();
    }

    public final OooO<Long> OooOOO0(oo0oOO0<Long> oo0ooo0) {
        return this.f41785OooO00o.getLong(oo0ooo0.OooO0OO());
    }

    public final long OooOOOO() {
        o00O0O0O o00o0o0o2;
        synchronized (o00O0O0O.class) {
            if (o00O0O0O.f41803OooO00o == null) {
                o00O0O0O.f41803OooO00o = new o00O0O0O();
            }
            o00o0o0o2 = o00O0O0O.f41803OooO00o;
        }
        OooO<Long> oooOOooOO0O = OooOO0O(o00o0o0o2);
        if (oooOOooOO0O.OooO0O0() && OooOo00(oooOOooOO0O.OooO00o().longValue())) {
            return oooOOooOO0O.OooO00o().longValue();
        }
        OooO<Long> oooOOooOOO0 = OooOOO0(o00o0o0o2);
        if (oooOOooOOO0.OooO0O0() && OooOo00(oooOOooOOO0.OooO00o().longValue())) {
            this.f41787OooO0OO.OooO0OO(oooOOooOOO0.OooO00o().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
            return oooOOooOOO0.OooO00o().longValue();
        }
        OooO<Long> oooOOooO0OO = OooO0OO(o00o0o0o2);
        if (oooOOooO0OO.OooO0O0() && OooOo00(oooOOooO0OO.OooO00o().longValue())) {
            return oooOOooO0OO.OooO00o().longValue();
        }
        if (this.f41785OooO00o.isLastFetchFailed()) {
            Long l = 100L;
            return Long.valueOf(l.longValue() * 3).longValue();
        }
        Long l2 = 100L;
        return l2.longValue();
    }

    public final long OooOOOo() {
        oo0o0O0 oo0o0o0;
        synchronized (oo0o0O0.class) {
            if (oo0o0O0.f41811OooO00o == null) {
                oo0o0O0.f41811OooO00o = new oo0o0O0();
            }
            oo0o0o0 = oo0o0O0.f41811OooO00o;
        }
        OooO<Long> oooOOooOOO0 = OooOOO0(oo0o0o0);
        if (oooOOooOOO0.OooO0O0() && OooOOo(oooOOooOOO0.OooO00o().longValue())) {
            this.f41787OooO0OO.OooO0OO(oooOOooOOO0.OooO00o().longValue(), "com.google.firebase.perf.TraceEventCountBackground");
            return oooOOooOOO0.OooO00o().longValue();
        }
        OooO<Long> oooOOooO0OO = OooO0OO(oo0o0o0);
        if (oooOOooO0OO.OooO0O0() && OooOOo(oooOOooO0OO.OooO00o().longValue())) {
            return oooOOooO0OO.OooO00o().longValue();
        }
        Long l = 30L;
        return l.longValue();
    }

    public final long OooOOo0() {
        o00O0OO o00o0oo2;
        synchronized (o00O0OO.class) {
            if (o00O0OO.f41804OooO00o == null) {
                o00O0OO.f41804OooO00o = new o00O0OO();
            }
            o00o0oo2 = o00O0OO.f41804OooO00o;
        }
        OooO<Long> oooOOooOOO0 = OooOOO0(o00o0oo2);
        if (oooOOooOOO0.OooO0O0() && OooOOo(oooOOooOOO0.OooO00o().longValue())) {
            this.f41787OooO0OO.OooO0OO(oooOOooOOO0.OooO00o().longValue(), "com.google.firebase.perf.TraceEventCountForeground");
            return oooOOooOOO0.OooO00o().longValue();
        }
        OooO<Long> oooOOooO0OO = OooO0OO(o00o0oo2);
        if (oooOOooO0OO.OooO0O0() && OooOOo(oooOOooO0OO.OooO00o().longValue())) {
            return oooOOooO0OO.OooO00o().longValue();
        }
        Long l = 300L;
        return l.longValue();
    }

    public final boolean OooOo0() {
        o00O00o0 o00o00o1;
        boolean zBooleanValue;
        Boolean boolOooO0oO = OooO0oO();
        if (boolOooO0oO != null && !boolOooO0oO.booleanValue()) {
            return false;
        }
        synchronized (o00O00o0.class) {
            if (o00O00o0.f41800OooO00o == null) {
                o00O00o0.f41800OooO00o = new o00O00o0();
            }
            o00o00o1 = o00O00o0.f41800OooO00o;
        }
        RemoteConfigManager remoteConfigManager = this.f41785OooO00o;
        o00o00o1.getClass();
        OooO<Boolean> oooO = remoteConfigManager.getBoolean("fpr_enabled");
        if (!oooO.OooO0O0()) {
            OooO<Boolean> oooOOooO00o = OooO00o(o00o00o1);
            zBooleanValue = oooOOooO00o.OooO0O0() ? oooOOooO00o.OooO00o().booleanValue() : true;
        } else if (this.f41785OooO00o.isLastFetchFailed()) {
            zBooleanValue = false;
        } else {
            this.f41787OooO0OO.OooO0o("com.google.firebase.perf.SdkEnabled", oooO.OooO00o().booleanValue());
            zBooleanValue = oooO.OooO00o().booleanValue();
        }
        return zBooleanValue && !OooO0oo();
    }
}
