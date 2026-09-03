package p319o0O0oo0O;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.util.OooO;
import com.google.firebase.perf.util.OooOO0;
import java.util.concurrent.Executors;
import p304o0O0o0oO.Oooo000;
import p307o0O0oO0.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOOO0 f42679OooO0Oo = OooOOO0.OooO0Oo();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static volatile o0Oo0oo f42680OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RemoteConfigManager f42681OooO00o = RemoteConfigManager.getInstance();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO f42682OooO0O0 = new OooO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O0o f42683OooO0OO;

    @VisibleForTesting
    public o0Oo0oo() {
        o000O0o o000o0o2;
        OooOOO0 oooOOO0 = o000O0o.f42671OooO0OO;
        synchronized (o000O0o.class) {
            if (o000O0o.f42672OooO0Oo == null) {
                o000O0o.f42672OooO0Oo = new o000O0o(Executors.newSingleThreadExecutor());
            }
            o000o0o2 = o000O0o.f42672OooO0Oo;
        }
        this.f42683OooO0OO = o000o0o2;
    }

    public static synchronized o0Oo0oo OooO0o0() {
        if (f42680OooO0o0 == null) {
            f42680OooO0o0 = new o0Oo0oo();
        }
        return f42680OooO0o0;
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
            Boolean bool = Oooo000.f42409OooO00o;
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
    /* JADX WARN: Type inference failed for: r5v4, types: [o0O0oO0.OooOOO0] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.firebase.perf.util.OooOO0<java.lang.Boolean>] */
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
    public final OooOO0<Boolean> OooO(o000O000<Boolean> o000o001) {
        boolean z;
        Boolean bool;
        OooO oooO = this.f42682OooO0O0;
        ?? OooO0O1 = o000o001.OooO0O0();
        if (OooO0O1 != 0) {
            if (oooO.f20458OooO00o.containsKey(OooO0O1)) {
                z = true;
            }
            if (!z) {
                return new OooOO0<>();
            }
            try {
                bool = (Boolean) oooO.f20458OooO00o.get(OooO0O1);
                if (bool == null) {
                    OooO0O1 = new OooOO0();
                } else {
                    OooO0O1 = new OooOO0(bool);
                }
                return OooO0O1;
            } catch (ClassCastException e) {
                OooO.f20457OooO0O0.OooO0O0("Metadata key %s contains type other than boolean: %s", new Object[]{OooO0O1, e.getMessage()});
                return new OooOO0<>();
            }
        }
        oooO.getClass();
        z = false;
        if (!z) {
            return new OooOO0<>();
        }
        bool = (Boolean) oooO.f20458OooO00o.get(OooO0O1);
        if (bool == null) {
            OooO0O1 = new OooOO0();
        } else {
            OooO0O1 = new OooOO0(bool);
        }
        return OooO0O1;
    }

    public final OooOO0<Boolean> OooO00o(o000O000<Boolean> o000o001) {
        o000O0o o000o0o2 = this.f42683OooO0OO;
        String strOooO00o = o000o001.OooO00o();
        if (strOooO00o == null) {
            o000o0o2.getClass();
            o000O0o.f42671OooO0OO.OooO00o("Key is null when getting boolean value on device cache.");
            return new OooOO0<>();
        }
        if (o000o0o2.f42673OooO00o == null) {
            o000o0o2.OooO0O0(o000O0o.OooO00o());
            if (o000o0o2.f42673OooO00o == null) {
                return new OooOO0<>();
            }
        }
        if (!o000o0o2.f42673OooO00o.contains(strOooO00o)) {
            return new OooOO0<>();
        }
        try {
            return new OooOO0<>(Boolean.valueOf(o000o0o2.f42673OooO00o.getBoolean(strOooO00o, false)));
        } catch (ClassCastException e) {
            o000O0o.f42671OooO0OO.OooO0O0("Key %s from sharedPreferences has type other than long: %s", strOooO00o, e.getMessage());
            return new OooOO0<>();
        }
    }

    public final OooOO0<Double> OooO0O0(o000O000<Double> o000o001) {
        o000O0o o000o0o2 = this.f42683OooO0OO;
        String strOooO00o = o000o001.OooO00o();
        if (strOooO00o == null) {
            o000o0o2.getClass();
            o000O0o.f42671OooO0OO.OooO00o("Key is null when getting double value on device cache.");
            return new OooOO0<>();
        }
        if (o000o0o2.f42673OooO00o == null) {
            o000o0o2.OooO0O0(o000O0o.OooO00o());
            if (o000o0o2.f42673OooO00o == null) {
                return new OooOO0<>();
            }
        }
        if (!o000o0o2.f42673OooO00o.contains(strOooO00o)) {
            return new OooOO0<>();
        }
        try {
            try {
                return new OooOO0<>(Double.valueOf(Double.longBitsToDouble(o000o0o2.f42673OooO00o.getLong(strOooO00o, 0L))));
            } catch (ClassCastException unused) {
                return new OooOO0<>(Double.valueOf(Float.valueOf(o000o0o2.f42673OooO00o.getFloat(strOooO00o, 0.0f)).doubleValue()));
            }
        } catch (ClassCastException e) {
            o000O0o.f42671OooO0OO.OooO0O0("Key %s from sharedPreferences has type other than double: %s", strOooO00o, e.getMessage());
            return new OooOO0<>();
        }
    }

    public final OooOO0<Long> OooO0OO(o000O000<Long> o000o001) {
        o000O0o o000o0o2 = this.f42683OooO0OO;
        String strOooO00o = o000o001.OooO00o();
        if (strOooO00o == null) {
            o000o0o2.getClass();
            o000O0o.f42671OooO0OO.OooO00o("Key is null when getting long value on device cache.");
            return new OooOO0<>();
        }
        if (o000o0o2.f42673OooO00o == null) {
            o000o0o2.OooO0O0(o000O0o.OooO00o());
            if (o000o0o2.f42673OooO00o == null) {
                return new OooOO0<>();
            }
        }
        if (!o000o0o2.f42673OooO00o.contains(strOooO00o)) {
            return new OooOO0<>();
        }
        try {
            return new OooOO0<>(Long.valueOf(o000o0o2.f42673OooO00o.getLong(strOooO00o, 0L)));
        } catch (ClassCastException e) {
            o000O0o.f42671OooO0OO.OooO0O0("Key %s from sharedPreferences has type other than long: %s", strOooO00o, e.getMessage());
            return new OooOO0<>();
        }
    }

    public final OooOO0<String> OooO0Oo(o000O000<String> o000o001) {
        o000O0o o000o0o2 = this.f42683OooO0OO;
        String strOooO00o = o000o001.OooO00o();
        if (strOooO00o == null) {
            o000o0o2.getClass();
            o000O0o.f42671OooO0OO.OooO00o("Key is null when getting String value on device cache.");
            return new OooOO0<>();
        }
        if (o000o0o2.f42673OooO00o == null) {
            o000o0o2.OooO0O0(o000O0o.OooO00o());
            if (o000o0o2.f42673OooO00o == null) {
                return new OooOO0<>();
            }
        }
        if (!o000o0o2.f42673OooO00o.contains(strOooO00o)) {
            return new OooOO0<>();
        }
        try {
            return new OooOO0<>(o000o0o2.f42673OooO00o.getString(strOooO00o, ""));
        } catch (ClassCastException e) {
            o000O0o.f42671OooO0OO.OooO0O0("Key %s from sharedPreferences has type other than String: %s", strOooO00o, e.getMessage());
            return new OooOO0<>();
        }
    }

    public final boolean OooO0o() {
        o0O0O00 o0o0o00;
        synchronized (o0O0O00.class) {
            if (o0O0O00.f42677OooO00o == null) {
                o0O0O00.f42677OooO00o = new o0O0O00();
            }
            o0o0o00 = o0O0O00.f42677OooO00o;
        }
        OooOO0<Boolean> oooOO0OooO = OooO(o0o0o00);
        if (oooOO0OooO.OooO0O0()) {
            return oooOO0OooO.OooO00o().booleanValue();
        }
        OooOO0<Boolean> oooOO1 = this.f42681OooO00o.getBoolean("fpr_experiment_app_start_ttid");
        if (oooOO1.OooO0O0()) {
            this.f42683OooO0OO.OooO0o("com.google.firebase.perf.ExperimentTTID", oooOO1.OooO00o().booleanValue());
            return oooOO1.OooO00o().booleanValue();
        }
        OooOO0<Boolean> oooOO0OooO00o = OooO00o(o0o0o00);
        if (oooOO0OooO00o.OooO0O0()) {
            return oooOO0OooO00o.OooO00o().booleanValue();
        }
        return false;
    }

    @Nullable
    public final Boolean OooO0oO() {
        o0OO00O o0oo00o2;
        synchronized (o0OO00O.class) {
            if (o0OO00O.f42678OooO00o == null) {
                o0OO00O.f42678OooO00o = new o0OO00O();
            }
            o0oo00o2 = o0OO00O.f42678OooO00o;
        }
        OooOO0<Boolean> oooOO0OooO = OooO(o0oo00o2);
        if ((oooOO0OooO.OooO0O0() ? oooOO0OooO.OooO00o() : Boolean.FALSE).booleanValue()) {
            return Boolean.FALSE;
        }
        oo0o0Oo oo0o0ooOooO0Oo = oo0o0Oo.OooO0Oo();
        OooOO0<Boolean> oooOO0OooO00o = OooO00o(oo0o0ooOooO0Oo);
        if (oooOO0OooO00o.OooO0O0()) {
            return oooOO0OooO00o.OooO00o();
        }
        OooOO0<Boolean> oooOO0OooO2 = OooO(oo0o0ooOooO0Oo);
        if (oooOO0OooO2.OooO0O0()) {
            return oooOO0OooO2.OooO00o();
        }
        return null;
    }

    public final boolean OooO0oo() {
        o00000OO o00000oo2;
        synchronized (o00000OO.class) {
            if (o00000OO.f42663OooO00o == null) {
                o00000OO.f42663OooO00o = new o00000OO();
            }
            o00000oo2 = o00000OO.f42663OooO00o;
        }
        RemoteConfigManager remoteConfigManager = this.f42681OooO00o;
        o00000oo2.getClass();
        OooOO0<String> string = remoteConfigManager.getString("fpr_disabled_android_versions");
        if (string.OooO0O0()) {
            this.f42683OooO0OO.OooO0o0("com.google.firebase.perf.SdkDisabledVersions", string.OooO00o());
            return OooOOoo(string.OooO00o());
        }
        OooOO0<String> oooOO0OooO0Oo = OooO0Oo(o00000oo2);
        return oooOO0OooO0Oo.OooO0O0() ? OooOOoo(oooOO0OooO0Oo.OooO00o()) : OooOOoo("");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    public final OooOO0<Double> OooOO0(o000O000<Double> o000o001) {
        boolean z;
        Object obj;
        OooO oooO = this.f42682OooO0O0;
        String strOooO0O0 = o000o001.OooO0O0();
        if (strOooO0O0 != null) {
            if (oooO.f20458OooO00o.containsKey(strOooO0O0)) {
                z = true;
            }
            if (!z) {
                return new OooOO0<>();
            }
            obj = oooO.f20458OooO00o.get(strOooO0O0);
            if (obj == null) {
                return new OooOO0<>();
            }
            if (obj instanceof Float) {
                return new OooOO0<>(Double.valueOf(((Float) obj).doubleValue()));
            }
            if (obj instanceof Double) {
                return new OooOO0<>((Double) obj);
            }
            OooO.f20457OooO0O0.OooO0O0("Metadata key %s contains type other than double: %s", strOooO0O0);
            return new OooOO0<>();
        }
        oooO.getClass();
        z = false;
        if (!z) {
            return new OooOO0<>();
        }
        obj = oooO.f20458OooO00o.get(strOooO0O0);
        if (obj == null) {
            return new OooOO0<>();
        }
        if (obj instanceof Float) {
            return new OooOO0<>(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new OooOO0<>((Double) obj);
        }
        OooO.f20457OooO0O0.OooO0O0("Metadata key %s contains type other than double: %s", strOooO0O0);
        return new OooOO0<>();
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
    /* JADX WARN: Type inference failed for: r5v14, types: [com.google.firebase.perf.util.OooOO0] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [o0O0oO0.OooOOO0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.firebase.perf.util.OooOO0] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.google.firebase.perf.util.OooOO0] */
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
    public final OooOO0<Long> OooOO0O(o000O000<Long> o000o001) {
        boolean z;
        Integer num;
        OooO oooO = this.f42682OooO0O0;
        ?? OooO0O1 = o000o001.OooO0O0();
        if (OooO0O1 != 0) {
            if (oooO.f20458OooO00o.containsKey(OooO0O1)) {
                z = true;
            }
            if (z) {
                try {
                    num = (Integer) oooO.f20458OooO00o.get(OooO0O1);
                    if (num == null) {
                        OooO0O1 = new OooOO0();
                    } else {
                        OooO0O1 = new OooOO0(num);
                    }
                } catch (ClassCastException e) {
                    OooO.f20457OooO0O0.OooO0O0("Metadata key %s contains type other than int: %s", new Object[]{OooO0O1, e.getMessage()});
                    OooO0O1 = new OooOO0();
                }
            } else {
                OooO0O1 = new OooOO0();
            }
            return OooO0O1.OooO0O0() ? new OooOO0<>(Long.valueOf(((Integer) OooO0O1.OooO00o()).intValue())) : new OooOO0<>();
        }
        oooO.getClass();
        z = false;
        if (z) {
            OooO0O1 = new OooOO0();
        } else {
            num = (Integer) oooO.f20458OooO00o.get(OooO0O1);
            if (num == null) {
                OooO0O1 = new OooOO0();
            } else {
                OooO0O1 = new OooOO0(num);
            }
        }
        if (OooO0O1.OooO0O0()) {
        }
    }

    public final long OooOO0o() {
        o00000O o00000o;
        synchronized (o00000O.class) {
            if (o00000O.f42661OooO00o == null) {
                o00000O.f42661OooO00o = new o00000O();
            }
            o00000o = o00000O.f42661OooO00o;
        }
        OooOO0<Long> oooOO0OooOOO0 = OooOOO0(o00000o);
        if (oooOO0OooOOO0.OooO0O0()) {
            if (oooOO0OooOOO0.OooO00o().longValue() > 0) {
                this.f42683OooO0OO.OooO0OO(oooOO0OooOOO0.OooO00o().longValue(), "com.google.firebase.perf.TimeLimitSec");
                return oooOO0OooOOO0.OooO00o().longValue();
            }
        }
        OooOO0<Long> oooOO0OooO0OO = OooO0OO(o00000o);
        if (oooOO0OooO0OO.OooO0O0()) {
            if (oooOO0OooO0OO.OooO00o().longValue() > 0) {
                return oooOO0OooO0OO.OooO00o().longValue();
            }
        }
        Long l = 600L;
        return l.longValue();
    }

    public final long OooOOO() {
        o0000O00 o0000o00;
        synchronized (o0000O00.class) {
            if (o0000O00.f42666OooO00o == null) {
                o0000O00.f42666OooO00o = new o0000O00();
            }
            o0000o00 = o0000O00.f42666OooO00o;
        }
        OooOO0<Long> oooOO0OooOO0O = OooOO0O(o0000o00);
        if (oooOO0OooOO0O.OooO0O0() && OooOo00(oooOO0OooOO0O.OooO00o().longValue())) {
            return oooOO0OooOO0O.OooO00o().longValue();
        }
        OooOO0<Long> oooOO0OooOOO0 = OooOOO0(o0000o00);
        if (oooOO0OooOOO0.OooO0O0() && OooOo00(oooOO0OooOOO0.OooO00o().longValue())) {
            this.f42683OooO0OO.OooO0OO(oooOO0OooOOO0.OooO00o().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
            return oooOO0OooOOO0.OooO00o().longValue();
        }
        OooOO0<Long> oooOO0OooO0OO = OooO0OO(o0000o00);
        if (oooOO0OooO0OO.OooO0O0() && OooOo00(oooOO0OooO0OO.OooO00o().longValue())) {
            return oooOO0OooO0OO.OooO00o().longValue();
        }
        if (this.f42681OooO00o.isLastFetchFailed()) {
            Long l = 100L;
            return Long.valueOf(l.longValue() * 3).longValue();
        }
        Long l2 = 100L;
        return l2.longValue();
    }

    public final OooOO0<Long> OooOOO0(o000O000<Long> o000o001) {
        return this.f42681OooO00o.getLong(o000o001.OooO0OO());
    }

    public final long OooOOOO() {
        o0000O0O o0000o0o2;
        synchronized (o0000O0O.class) {
            if (o0000O0O.f42667OooO00o == null) {
                o0000O0O.f42667OooO00o = new o0000O0O();
            }
            o0000o0o2 = o0000O0O.f42667OooO00o;
        }
        OooOO0<Long> oooOO0OooOO0O = OooOO0O(o0000o0o2);
        if (oooOO0OooOO0O.OooO0O0() && OooOo00(oooOO0OooOO0O.OooO00o().longValue())) {
            return oooOO0OooOO0O.OooO00o().longValue();
        }
        OooOO0<Long> oooOO0OooOOO0 = OooOOO0(o0000o0o2);
        if (oooOO0OooOOO0.OooO0O0() && OooOo00(oooOO0OooOOO0.OooO00o().longValue())) {
            this.f42683OooO0OO.OooO0OO(oooOO0OooOOO0.OooO00o().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
            return oooOO0OooOOO0.OooO00o().longValue();
        }
        OooOO0<Long> oooOO0OooO0OO = OooO0OO(o0000o0o2);
        if (oooOO0OooO0OO.OooO0O0() && OooOo00(oooOO0OooO0OO.OooO00o().longValue())) {
            return oooOO0OooO0OO.OooO00o().longValue();
        }
        if (this.f42681OooO00o.isLastFetchFailed()) {
            Long l = 100L;
            return Long.valueOf(l.longValue() * 3).longValue();
        }
        Long l2 = 100L;
        return l2.longValue();
    }

    public final long OooOOOo() {
        o0000O o0000o2;
        synchronized (o0000O.class) {
            if (o0000O.f42664OooO00o == null) {
                o0000O.f42664OooO00o = new o0000O();
            }
            o0000o2 = o0000O.f42664OooO00o;
        }
        OooOO0<Long> oooOO0OooOOO0 = OooOOO0(o0000o2);
        if (oooOO0OooOOO0.OooO0O0() && OooOOo(oooOO0OooOOO0.OooO00o().longValue())) {
            this.f42683OooO0OO.OooO0OO(oooOO0OooOOO0.OooO00o().longValue(), "com.google.firebase.perf.TraceEventCountBackground");
            return oooOO0OooOOO0.OooO00o().longValue();
        }
        OooOO0<Long> oooOO0OooO0OO = OooO0OO(o0000o2);
        if (oooOO0OooO0OO.OooO0O0() && OooOOo(oooOO0OooO0OO.OooO00o().longValue())) {
            return oooOO0OooO0OO.OooO00o().longValue();
        }
        Long l = 30L;
        return l.longValue();
    }

    public final long OooOOo0() {
        o0000OO0 o0000oo1;
        synchronized (o0000OO0.class) {
            if (o0000OO0.f42668OooO00o == null) {
                o0000OO0.f42668OooO00o = new o0000OO0();
            }
            o0000oo1 = o0000OO0.f42668OooO00o;
        }
        OooOO0<Long> oooOO0OooOOO0 = OooOOO0(o0000oo1);
        if (oooOO0OooOOO0.OooO0O0() && OooOOo(oooOO0OooOOO0.OooO00o().longValue())) {
            this.f42683OooO0OO.OooO0OO(oooOO0OooOOO0.OooO00o().longValue(), "com.google.firebase.perf.TraceEventCountForeground");
            return oooOO0OooOOO0.OooO00o().longValue();
        }
        OooOO0<Long> oooOO0OooO0OO = OooO0OO(o0000oo1);
        if (oooOO0OooO0OO.OooO0O0() && OooOOo(oooOO0OooO0OO.OooO00o().longValue())) {
            return oooOO0OooO0OO.OooO00o().longValue();
        }
        Long l = 300L;
        return l.longValue();
    }

    public final boolean OooOo0() {
        o0000Ooo o0000ooo;
        boolean zBooleanValue;
        Boolean boolOooO0oO = OooO0oO();
        if (boolOooO0oO != null && !boolOooO0oO.booleanValue()) {
            return false;
        }
        synchronized (o0000Ooo.class) {
            if (o0000Ooo.f42669OooO00o == null) {
                o0000Ooo.f42669OooO00o = new o0000Ooo();
            }
            o0000ooo = o0000Ooo.f42669OooO00o;
        }
        RemoteConfigManager remoteConfigManager = this.f42681OooO00o;
        o0000ooo.getClass();
        OooOO0<Boolean> oooOO1 = remoteConfigManager.getBoolean("fpr_enabled");
        if (!oooOO1.OooO0O0()) {
            OooOO0<Boolean> oooOO0OooO00o = OooO00o(o0000ooo);
            zBooleanValue = oooOO0OooO00o.OooO0O0() ? oooOO0OooO00o.OooO00o().booleanValue() : true;
        } else if (this.f42681OooO00o.isLastFetchFailed()) {
            zBooleanValue = false;
        } else {
            this.f42683OooO0OO.OooO0o("com.google.firebase.perf.SdkEnabled", oooOO1.OooO00o().booleanValue());
            zBooleanValue = oooOO1.OooO00o().booleanValue();
        }
        return zBooleanValue && !OooO0oo();
    }
}
