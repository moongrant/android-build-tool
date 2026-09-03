package p494o0o00OOo;

import android.net.Uri;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OooO0OO;
import com.app.selectPicture.model.SelectImageData;
import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p139o00OOOo0.OooOO0O;
import p139o00OOOo0.OooOOO0;
import p143o00OOooo.OooOOO;
import p423o0OoO0OO.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f49579OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(o0OoOo0 o0oooo1) {
        super(1);
        this.f49579OooO0Oo = o0oooo1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        MomentSendActivity activity;
        if (bool.booleanValue()) {
            o0OoOo0 o0oooo1 = this.f49579OooO0Oo;
            o0oooo1.getClass();
            SelectImageData selectImageData = new SelectImageData();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = o0oooo1.f49592OooO0OO.f13189OooOOoo.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                activity = o0oooo1.f49590OooO00o;
                if (!zHasNext) {
                    break;
                }
                MomentSelectMedia momentSelectMedia = (MomentSelectMedia) it.next();
                if (o00O00OO.OooO0o(momentSelectMedia.getPath())) {
                    Uri uriOooO0OO = OooOOO.OooO0OO(activity, momentSelectMedia.getPath(), momentSelectMedia.getDuration() > 0);
                    if (uriOooO0OO == null) {
                        uriOooO0OO = Uri.parse(String.valueOf(System.currentTimeMillis()));
                    }
                    selectImageData.OooO00o().add(uriOooO0OO);
                    if (o00O00OO.OooO0Oo(momentSelectMedia.getPath()) || !new File(momentSelectMedia.getPath()).exists()) {
                        arrayList2.add(uriOooO0OO);
                        Intrinsics.checkNotNull(momentSelectMedia);
                        arrayList.add(momentSelectMedia);
                    }
                }
            }
            o0ooOOo o0ooooo = new o0ooOOo(arrayList, o0oooo1, arrayList2);
            Intrinsics.checkNotNullParameter(activity, "activity");
            new SelectImageData();
            Intrinsics.checkNotNullParameter(selectImageData, "<set-?>");
            OooOO0O.f37478OooO0O0 = o00oO0o.f49581OooO0Oo;
            activity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.app.selectPicture.SelectImageResult$toMoreImage$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                    OooO0OO.OooO00o(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final void onDestroy(@NotNull LifecycleOwner owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    OooOO0O.f37478OooO0O0 = null;
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                    OooO0OO.OooO0OO(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                    OooO0OO.OooO0Oo(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                    OooO0OO.OooO0o0(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                    OooO0OO.OooO0o(this, lifecycleOwner);
                }
            });
            Intrinsics.checkNotNullParameter(activity, "activity");
            OooOOO0 oooOOO0 = new OooOOO0(activity);
            oooOOO0.f37497OooO0O0 = 9;
            oooOOO0.f37498OooO0OO = false;
            oooOOO0.f37499OooO0Oo = false;
            oooOOO0.f37501OooO0o0 = 1.0f;
            oooOOO0.f37500OooO0o = 1.0f;
            oooOOO0.f37502OooO0oO = true;
            oooOOO0.f37503OooO0oo = true;
            oooOOO0.f37495OooO = false;
            oooOOO0.f37504OooOO0 = selectImageData;
            OooOO0O.OooO00o(oooOOO0, o0ooooo);
        }
        return Unit.INSTANCE;
    }
}
