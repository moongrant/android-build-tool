package p110o000ooo0;

import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p497o0o00OoO.oo0O;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f35828OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f35829OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f35830OooO0o0;

    public /* synthetic */ o0000(int i, Object obj, Object obj2) {
        this.f35828OooO0Oo = i;
        this.f35830OooO0o0 = obj;
        this.f35829OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f35828OooO0Oo;
        Object obj = this.f35829OooO0o;
        Object obj2 = this.f35830OooO0o0;
        switch (i) {
            case 0:
                o0000O00 this$0 = (o0000O00) obj2;
                String sql = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(sql, "$sql");
                this$0.getClass();
                CollectionsKt.emptyList();
                throw null;
            case 1:
                GraphRequest.Companion.m4051runCallbacks$lambda2((ArrayList) obj2, (GraphRequestBatch) obj);
                return;
            default:
                oo0O this$1 = (oo0O) obj2;
                RoomUserInfoModel userModel = (RoomUserInfoModel) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(userModel, "$userModel");
                this$1.f49626OooO00o.OooOoO(userModel);
                return;
        }
    }
}
