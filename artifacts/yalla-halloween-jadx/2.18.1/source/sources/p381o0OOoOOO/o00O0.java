package p381o0OOoOOO;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.app.base.model.CommonParseMultiListModel;
import com.app.base.model.RoomIndexModel;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.OooO00o;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p498o0o00Oo0.oo0oOO0;
import p500o0o00Ooo.o0000Ooo;
import p649o0ooOOoo.cb;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f38742Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f38743Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f38744Oooo0oo;

    public /* synthetic */ o00O0(Object obj, Object obj2, int i) {
        this.f38742Oooo0o = i;
        this.f38743Oooo0oO = obj;
        this.f38744Oooo0oo = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38742Oooo0o) {
            case 0:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f38743Oooo0oO;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f38744Oooo0oo;
                OooO00o oooO00o = FirebaseMessaging.f19170OooOOO;
                Objects.requireNonNull(firebaseMessaging);
                try {
                    oo0o0O0 oo0o0o0 = firebaseMessaging.f19180OooO0o0;
                    Objects.requireNonNull(oo0o0o0);
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    Tasks.await(oo0o0o0.OooO00o(oo0o0o0.OooO0OO(oo0oOO0.OooO0O0(oo0o0o0.f38831OooO00o), "*", bundle)));
                    OooO00o oooO00oOooO0Oo = FirebaseMessaging.OooO0Oo(firebaseMessaging.f19178OooO0Oo);
                    String strOooO0o0 = firebaseMessaging.OooO0o0();
                    String strOooO0O0 = oo0oOO0.OooO0O0(firebaseMessaging.f19175OooO00o);
                    synchronized (oooO00oOooO0Oo) {
                        String strOooO00o = oooO00oOooO0Oo.OooO00o(strOooO0o0, strOooO0O0);
                        SharedPreferences.Editor editorEdit = oooO00oOooO0Oo.f19191OooO00o.edit();
                        editorEdit.remove(strOooO00o);
                        editorEdit.commit();
                    }
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            default:
                MainRoomPopularFragment fragment = (MainRoomPopularFragment) this.f38743Oooo0oO;
                CommonParseMultiListModel result = (CommonParseMultiListModel) this.f38744Oooo0oo;
                Intrinsics.checkNotNullParameter(fragment, "this$0");
                Intrinsics.checkNotNullParameter(result, "$result");
                if (fragment.isFirstApiStatistical) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                o0000Ooo.OooO00o oooO00oOooO0O0 = o0000Ooo.f41382OooO00o.OooO0O0(((cb) fragment.getBinding()).f49089OooO0O0);
                int i = oooO00oOooO0O0.f41385OooO00o;
                if (i < 0) {
                    i = 0;
                }
                if (oooO00oOooO0O0.f41387OooO0OO < result.data.size()) {
                    int i2 = oooO00oOooO0O0.f41387OooO0OO;
                    while (i < i2) {
                        if (result.data.size() > i) {
                            arrayList.add(((RoomIndexModel) result.data.get(i)).barid);
                            arrayList2.add(((RoomIndexModel) result.data.get(i)).sessionId);
                        }
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                fragment.isFirstApiStatistical = true;
                EnterRoomParentPage expoSource = EnterRoomParentPage.AII_Popular;
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(expoSource, "expoSource");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new oo0oOO0(arrayList, arrayList2, expoSource, null), 3, null);
                return;
        }
    }
}
