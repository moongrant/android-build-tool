package oo0OOoo;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p296o0O0OoO0.o00O0O;
import p381o0OOoOOO.o00O00O;
import p515o0o0O00.o00O00;
import p529o0o0OO0o.o00O0000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements o00O0O, Continuation, OnSuccessListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ OooO00o f53341OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ OooO00o f53342OooO0o0 = new OooO00o();

    public final Extractor[] OooO00o() {
        return new Extractor[]{new AmrExtractor()};
    }

    @Override // p296o0O0OoO0.o00O0O
    public final Extractor[] OooO0O0(Uri uri, Map map) {
        return OooO00o();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        String token = (String) obj;
        o00O00.OooO0OO("YLFirebaseMessagingService", "token = " + token);
        Intrinsics.checkNotNullExpressionValue(token, "it");
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O0000(token, null), 3, null);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Object obj = o00O00O.f38753OooO0O0;
        return 403;
    }
}
