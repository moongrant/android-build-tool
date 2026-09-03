package p488o0o00O0o;

import android.net.Uri;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OooO00o;
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
import o00O0OO.OooO;
import o00O0OO.OooO0o;
import org.jetbrains.annotations.NotNull;
import p117o00O0Oo.OooOOO0;
import p417o0OoO0.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f48447OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(o0OO00O o0oo00o2) {
        super(1);
        this.f48447OooO0Oo = o0oo00o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        MomentSendActivity activity;
        if (bool.booleanValue()) {
            o0OO00O o0oo00o2 = this.f48447OooO0Oo;
            o0oo00o2.getClass();
            SelectImageData selectImageData = new SelectImageData();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = o0oo00o2.f48450OooO0OO.f10111OooOOoo.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                activity = o0oo00o2.f48448OooO00o;
                if (!zHasNext) {
                    break;
                }
                MomentSelectMedia item = (MomentSelectMedia) it.next();
                if (o0000O0O.OooO0o(item.getPath())) {
                    Uri uriOooO0OO = OooOOO0.OooO0OO(activity, item.getPath(), item.getDuration() > 0);
                    if (uriOooO0OO == null) {
                        uriOooO0OO = Uri.parse(String.valueOf(System.currentTimeMillis()));
                    }
                    selectImageData.OooO00o().add(uriOooO0OO);
                    if (o0000O0O.OooO0Oo(item.getPath()) || !new File(item.getPath()).exists()) {
                        arrayList2.add(uriOooO0OO);
                        Intrinsics.checkNotNullExpressionValue(item, "item");
                        arrayList.add(item);
                    }
                }
            }
            o00000 o00000Var = new o00000(arrayList, o0oo00o2, arrayList2);
            Intrinsics.checkNotNullParameter(activity, "activity");
            new SelectImageData();
            Intrinsics.checkNotNullParameter(selectImageData, "<set-?>");
            OooO0o.f36541OooO0O0 = o000000O.f48422OooO0Oo;
            activity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.app.selectPicture.SelectImageResult$toMoreImage$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                    OooO00o.OooO00o(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final void onDestroy(@NotNull LifecycleOwner owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    OooO0o.f36541OooO0O0 = null;
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                    OooO00o.OooO0OO(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                    OooO00o.OooO0Oo(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                    OooO00o.OooO0o0(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                    OooO00o.OooO0o(this, lifecycleOwner);
                }
            });
            Intrinsics.checkNotNullParameter(activity, "activity");
            OooO oooO = new OooO(activity);
            oooO.f36525OooO0O0 = 9;
            oooO.f36526OooO0OO = false;
            oooO.f36527OooO0Oo = false;
            oooO.f36529OooO0o0 = 1.0f;
            oooO.f36528OooO0o = 1.0f;
            oooO.f36530OooO0oO = true;
            oooO.f36531OooO0oo = true;
            oooO.f36523OooO = false;
            oooO.f36532OooOO0 = selectImageData;
            OooO0o.OooO00o(oooO, o00000Var);
        }
        return Unit.INSTANCE;
    }
}
