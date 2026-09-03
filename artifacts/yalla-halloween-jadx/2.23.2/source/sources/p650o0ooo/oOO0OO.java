package p650o0ooo;

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
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OO extends Lambda implements Function2<Boolean, MotionEvent, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ oOO0OOO f58965OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GifRecyclerView f58966OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ List<View> f58967OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int[] f58968OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oOO0Oo00 f58969OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<View> f58970OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ GifListJson f58971OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OO(GifListJson gifListJson, oOO0OOO ooo0ooo, oOO0Oo00 ooo0oo00, GifRecyclerView gifRecyclerView, ArrayList arrayList, Ref.ObjectRef objectRef, int[] iArr) {
        super(2);
        this.f58966OooO0Oo = gifRecyclerView;
        this.f58968OooO0o0 = iArr;
        this.f58967OooO0o = arrayList;
        this.f58969OooO0oO = ooo0oo00;
        this.f58970OooO0oo = objectRef;
        this.f58965OooO = ooo0ooo;
        this.f58971OooOO0 = gifListJson;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [T, android.view.View] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, MotionEvent motionEvent) {
        boolean zBooleanValue = bool.booleanValue();
        MotionEvent ev = motionEvent;
        List<View> list = this.f58967OooO0o;
        GifRecyclerView gifRecyclerView = this.f58966OooO0Oo;
        int[] iArr = this.f58968OooO0o0;
        Intrinsics.checkNotNullParameter(ev, "ev");
        Ref.ObjectRef<View> objectRef = this.f58970OooO0oo;
        oOO0Oo00 ooo0oo00 = this.f58969OooO0oO;
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
                    if (oOO0Oo00.OooOO0O(ooo0oo00, view, ev) && !oOO0Oo00.OooOO0O(ooo0oo00, objectRef.element, ev)) {
                        int iOooO00o = iArr[1] - o0000O0.OooO00o(65);
                        int height = (iArr[1] + gifRecyclerView.getHeight()) - o0000O0.OooO00o(45);
                        int i6 = iArr2[1];
                        if (iOooO00o > i6 || i6 > height) {
                            z = false;
                        }
                        if (z) {
                            Object tag = view.getTag(o0OO00O.mic_position);
                            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                            Object obj = this.f58965OooO.f13189OooOOoo.get(((Integer) tag).intValue());
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.gift.GifConfigJson");
                            GifConfigJson gifConfigJson = (GifConfigJson) obj;
                            objectRef.element = view;
                            PopupWindow popupWindow = ooo0oo00.f58978OooOOO;
                            if (popupWindow != null) {
                                popupWindow.dismiss();
                            }
                            ooo0oo00.f58978OooOOO = null;
                            oOO0Oo00.OooOO0o(ooo0oo00, view, gifConfigJson.getGif(), this.f58971OooOO0.getFolderName(), i5);
                            break;
                        }
                    }
                    i2++;
                    i = 0;
                }
            } else {
                objectRef.element = null;
                PopupWindow popupWindow2 = ooo0oo00.f58978OooOOO;
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
