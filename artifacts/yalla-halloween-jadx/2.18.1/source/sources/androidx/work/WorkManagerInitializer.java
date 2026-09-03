package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import p096o000o0o.o00oO0o;
import p102o000oo.o0OoOo0;
import p102o000oo.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements o00oO0o<o0ooOOo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f9745OooO00o = o0OoOo0.OooO0o0("WrkMgrInitializer");

    @Override // p096o000o0o.o00oO0o
    @NonNull
    public final o0ooOOo create(@NonNull Context context) {
        o0OoOo0.OooO0OO().OooO00o(f9745OooO00o, "Initializing WorkManager with default configuration.", new Throwable[0]);
        p107o000ooO0.o00oO0o.OooO0OO(context, new OooO00o(new OooO00o.C0068OooO00o()));
        return p107o000ooO0.o00oO0o.OooO0O0(context);
    }

    @Override // p096o000o0o.o00oO0o
    @NonNull
    public final List<Class<? extends o00oO0o<?>>> dependencies() {
        return Collections.emptyList();
    }
}
