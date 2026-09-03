package p519o0o0O0oO;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.code.android.util.o0000O0;
import com.yalla.yalla.model.gift.GifConfigJson;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.ui.view.gift.GifRecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0 extends Lambda implements Function2<Boolean, MotionEvent, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ oOO0O000 f52902OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GifRecyclerView f52903OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ List<View> f52904OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int[] f52905OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oOO0O00O f52906OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<View> f52907OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ GifListJson f52908OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0(GifListJson gifListJson, oOO0O000 ooo0o000, oOO0O00O ooo0o00o, GifRecyclerView gifRecyclerView, ArrayList arrayList, Ref.ObjectRef objectRef, int[] iArr) {
        super(2);
        this.f52903OooO0Oo = gifRecyclerView;
        this.f52905OooO0o0 = iArr;
        this.f52904OooO0o = arrayList;
        this.f52906OooO0oO = ooo0o00o;
        this.f52907OooO0oo = objectRef;
        this.f52902OooO = ooo0o000;
        this.f52908OooOO0 = gifListJson;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [T, android.view.View] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, MotionEvent motionEvent) {
        boolean zBooleanValue = bool.booleanValue();
        MotionEvent ev = motionEvent;
        List<View> list = this.f52904OooO0o;
        GifRecyclerView gifRecyclerView = this.f52903OooO0Oo;
        int[] iArr = this.f52905OooO0o0;
        Intrinsics.checkNotNullParameter(ev, "ev");
        Ref.ObjectRef<View> objectRef = this.f52907OooO0oo;
        oOO0O00O ooo0o00o = this.f52906OooO0oO;
        try {
            if (zBooleanValue) {
                gifRecyclerView.getLocationOnScreen(iArr);
                int size = list.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    View view = list.get(i2);
                    int[] iArr2 = {i, i};
                    view.getLocationOnScreen(iArr2);
                    boolean z = true;
                    int i3 = iArr2[1];
                    int i4 = iArr[1];
                    int i5 = i3 < i4 ? i4 - i3 : i;
                    if (oOO0O00O.OooOO0O(ooo0o00o, view, ev) && !oOO0O00O.OooOO0O(ooo0o00o, objectRef.element, ev)) {
                        int iOooO00o = iArr[1] - o0000O0.OooO00o(65);
                        int height = (iArr[1] + gifRecyclerView.getHeight()) - o0000O0.OooO00o(45);
                        int i6 = iArr2[1];
                        if (iOooO00o > i6 || i6 > height) {
                            z = false;
                        }
                        if (z) {
                            Object tag = view.getTag(oO00O0oO.mic_position);
                            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                            Object obj = this.f52902OooO.f10111OooOOoo.get(((Integer) tag).intValue());
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.gift.GifConfigJson");
                            GifConfigJson gifConfigJson = (GifConfigJson) obj;
                            objectRef.element = view;
                            PopupWindow popupWindow = ooo0o00o.f52971OooOOO;
                            if (popupWindow != null) {
                                popupWindow.dismiss();
                            }
                            ooo0o00o.f52971OooOOO = null;
                            oOO0O00O.OooOO0o(ooo0o00o, view, gifConfigJson.getGif(), this.f52908OooOO0.getFolderName(), i5);
                            break;
                        }
                    }
                    i2++;
                    i = 0;
                }
            } else {
                objectRef.element = null;
                PopupWindow popupWindow2 = ooo0o00o.f52971OooOOO;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }
}
