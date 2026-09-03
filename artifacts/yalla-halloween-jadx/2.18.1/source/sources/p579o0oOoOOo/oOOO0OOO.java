package p579o0oOoOOo;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.model.GifConfigJson;
import com.yalla.yalla.model.GifListJson;
import com.yalla.yalla.ui.view.GifRecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOO0OOO extends Lambda implements Function2<Boolean, MotionEvent, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ oOOOOo0O f46176Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ GifRecyclerView f46177Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int[] f46178Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ List<View> f46179Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ oOOOoo00 f46180OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<View> f46181OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ GifListJson f46182OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO0OOO(GifRecyclerView gifRecyclerView, int[] iArr, List<View> list, oOOOOo0O oooooo0o, Ref.ObjectRef<View> objectRef, oOOOoo00 oooooo00, GifListJson gifListJson) {
        super(2);
        this.f46177Oooo0o = gifRecyclerView;
        this.f46178Oooo0oO = iArr;
        this.f46179Oooo0oo = list;
        this.f46176Oooo = oooooo0o;
        this.f46181OoooO00 = objectRef;
        this.f46180OoooO0 = oooooo00;
        this.f46182OoooO0O = gifListJson;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, android.view.View] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, MotionEvent motionEvent) {
        boolean zBooleanValue = bool.booleanValue();
        MotionEvent ev = motionEvent;
        Intrinsics.checkNotNullParameter(ev, "ev");
        try {
            if (zBooleanValue) {
                this.f46177Oooo0o.getLocationOnScreen(this.f46178Oooo0oO);
                int size = this.f46179Oooo0oo.size();
                for (int i = 0; i < size; i++) {
                    View view = this.f46179Oooo0oo.get(i);
                    boolean z = true;
                    int[] iArr = {0, 0};
                    view.getLocationOnScreen(iArr);
                    int i2 = iArr[1];
                    int[] iArr2 = this.f46178Oooo0oO;
                    int i3 = i2 < iArr2[1] ? iArr2[1] - iArr[1] : 0;
                    if (oOOOOo0O.OooOO0O(this.f46176Oooo, view, ev) && !oOOOOo0O.OooOO0O(this.f46176Oooo, this.f46181OoooO00.element, ev)) {
                        int iOooO00o = this.f46178Oooo0oO[1] - OooOo00.OooO00o(65);
                        int height = (this.f46178Oooo0oO[1] + this.f46177Oooo0o.getHeight()) - OooOo00.OooO00o(45);
                        int i4 = iArr[1];
                        if (iOooO00o > i4 || i4 > height) {
                            z = false;
                        }
                        if (z) {
                            Object tag = view.getTag(R.id.mic_position);
                            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                            GifConfigJson gifConfigJson = this.f46180OoooO0.getData().get(((Integer) tag).intValue());
                            Intrinsics.checkNotNull(gifConfigJson, "null cannot be cast to non-null type com.yalla.yalla.model.GifConfigJson");
                            GifConfigJson gifConfigJson2 = gifConfigJson;
                            this.f46181OoooO00.element = view;
                            PopupWindow popupWindow = this.f46176Oooo.f46185OoooOOO;
                            if (popupWindow != null) {
                                popupWindow.dismiss();
                            }
                            oOOOOo0O oooooo0o = this.f46176Oooo;
                            oooooo0o.f46185OoooOOO = null;
                            oOOOOo0O.OooOO0o(oooooo0o, view, gifConfigJson2.getGif(), this.f46182OoooO0O.getFolderName(), i3);
                            break;
                        }
                    }
                }
            } else {
                this.f46181OoooO00.element = null;
                PopupWindow popupWindow2 = this.f46176Oooo.f46185OoooOOO;
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
