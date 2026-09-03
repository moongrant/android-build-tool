package p650o0ooo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.yalla.yalla.model.gift.GifConfigJson;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.view.CrossRecyclerView;
import com.yalla.yalla.ui.view.gift.GifRecyclerView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.g1;
import p405o0Oo0OOO.l;
import p411o0Oo0o00.OooOO0O;
import p475o0Ooooo0.o0O00oO0;
import p541o0o0OoOO.oo00;
import p562o0oOo000.o000000;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMicEmojiPanelDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MicEmojiPanelDialog.kt\ncom/yalla/yalla/ui/dialog/MicEmojiPanelDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,327:1\n1#2:328\n*E\n"})
public final class oOO0Oo00 extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final l f58976OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f58977OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public PopupWindow f58978OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OooO0O0 f58979OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public g1 f58980OooOOOO;

    public final class OooO00o extends o0000oo<GifListJson> {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ oOO0Oo00 f58981OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull oOO0Oo00 ooo0oo00, @NotNull Context context, List<GifListJson> data) {
            super(oo0o0Oo.room_item_mic_emoji_panel_content, context, data);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f58981OooOoo0 = ooo0oo00;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            final GifListJson gifListJson = (GifListJson) obj;
            if (viewHolder == null || gifListJson == null) {
                return;
            }
            final int[] iArr = {0, 0};
            final GifRecyclerView gifRecyclerView = (GifRecyclerView) viewHolder.getView(o0OO00O.rvItemEmojiPanel);
            final ArrayList arrayList = new ArrayList();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            int i = oo0o0Oo.room_item_mic_emoji_panel;
            List<GifConfigJson> item = gifListJson.getItem();
            Context context = this.f56423OooOo;
            final oOO0OOO ooo0ooo = new oOO0OOO(gifListJson, context, i, item);
            gifRecyclerView.setLayoutManager(new GridLayoutManager(context, 4));
            gifRecyclerView.setAdapter(ooo0ooo);
            gifRecyclerView.setLongClickPreviewListener(new oOO0OO(gifListJson, ooo0ooo, this.f58981OooOoo0, gifRecyclerView, arrayList, objectRef, iArr));
            final oOO0Oo00 ooo0oo00 = this.f58981OooOoo0;
            ooo0ooo.f13171OooO = new BaseQuickAdapter.OooO0OO() { // from class: o0ooo.oOO0O0O
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0OO
                public final void OooO00o(View view, int i2) {
                    String gif;
                    List itemViewList = arrayList;
                    Intrinsics.checkNotNullParameter(itemViewList, "$itemViewList");
                    oOO0OOO adapter = ooo0ooo;
                    Intrinsics.checkNotNullParameter(adapter, "$adapter");
                    Ref.ObjectRef lastView = objectRef;
                    Intrinsics.checkNotNullParameter(lastView, "$lastView");
                    int[] rvLocal = iArr;
                    Intrinsics.checkNotNullParameter(rvLocal, "$rvLocal");
                    oOO0Oo00 this$0 = ooo0oo00;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    itemViewList.clear();
                    GifRecyclerView gifRecyclerView2 = gifRecyclerView;
                    int childCount = gifRecyclerView2.getChildCount();
                    boolean z = false;
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = gifRecyclerView2.getChildAt(i3);
                        Intrinsics.checkNotNull(childAt);
                        itemViewList.add(childAt);
                    }
                    gifRecyclerView2.setLongClickPreview(true);
                    GifConfigJson gifConfigJsonOooOOO = adapter.OooOOO(i2);
                    lastView.element = view;
                    int[] iArr2 = {0, 0};
                    view.getLocationOnScreen(iArr2);
                    int i4 = iArr2[1];
                    int i5 = rvLocal[1];
                    int i6 = i4 < i5 ? i5 - i4 : 0;
                    int iOooO00o = i5 - o0000O0.OooO00o(65);
                    int height = (gifRecyclerView2.getHeight() + rvLocal[1]) - o0000O0.OooO00o(45);
                    int i7 = iArr2[1];
                    if (iOooO00o <= i7 && i7 <= height) {
                        z = true;
                    }
                    if (z) {
                        Intrinsics.checkNotNull(view);
                        if (gifConfigJsonOooOOO == null || (gif = gifConfigJsonOooOOO.getGif()) == null) {
                            gif = "";
                        }
                        oOO0Oo00.OooOO0o(this$0, view, gif, gifListJson.getFolderName(), i6);
                    }
                }
            };
            ooo0ooo.f13176OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0ooo.oOO0OO0O
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
                public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                    oOO0OOO adapter = ooo0ooo;
                    Intrinsics.checkNotNullParameter(adapter, "$adapter");
                    oOO0Oo00 this$0 = ooo0oo00;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    GifConfigJson gifConfigJsonOooOOO = adapter.OooOOO(i2);
                    int lowestKAVIP = gifConfigJsonOooOOO != null ? gifConfigJsonOooOOO.getLowestKAVIP() : 0;
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    Pair pair = (Pair) o0O00oO0.OooOO0().getValue();
                    int iIntValue = pair != null ? ((Number) pair.getSecond()).intValue() : 0;
                    GifConfigJson gifConfigJsonOooOOO2 = adapter.OooOOO(i2);
                    int lowestVip = gifConfigJsonOooOOO2 != null ? gifConfigJsonOooOOO2.getLowestVip() : 0;
                    Pair pair2 = (Pair) o0O00oO0.OooOO0o().getValue();
                    boolean zBooleanValue = pair2 != null ? ((Boolean) pair2.getFirst()).booleanValue() : false;
                    Pair pair3 = (Pair) o0O00oO0.OooOO0o().getValue();
                    int iIntValue2 = pair3 != null ? ((Number) pair3.getSecond()).intValue() : 0;
                    if (lowestKAVIP > 0 && iIntValue < lowestKAVIP) {
                        o000O o000o = new o000O(this$0.f58507OooO0Oo);
                        o000o.OooOo00(o0000.OooO0OO(o000000.room_mic_emoji_upgrade_ka_vip_content));
                        o000o.OooOo(true);
                        o000o.OooOOOo(o0000.OooO0OO(o000000.room_mic_emoji_upgrade_ka_vip_dredge));
                        o000o.OooOo0(oOOO000o.f58986OooO0Oo);
                        o000o.OooOO0o();
                        return;
                    }
                    if ((!zBooleanValue || iIntValue2 < lowestVip) && lowestVip > 0) {
                        o000O o000o2 = new o000O(this$0.f58507OooO0Oo);
                        o000o2.OooOo00(o0000.OooO0OO(o000000.room_mic_emoji_upgrade_vip_content));
                        o000o2.OooOo(true);
                        o000o2.OooOOOo(o0000.OooO0OO(o000000.Get_Yalla_Premium));
                        o000o2.OooOo0(new oOOO00(o000o2));
                        o000o2.OooOO0o();
                        return;
                    }
                    GifConfigJson gifConfigJsonOooOOO3 = adapter.OooOOO(i2);
                    Pair[] pairArr = new Pair[1];
                    pairArr[0] = new Pair("emotiid", gifConfigJsonOooOOO3 != null ? Integer.valueOf(gifConfigJsonOooOOO3.getId()) : "");
                    OooO00o.OooO0OO("102033", MapsKt.hashMapOf(pairArr));
                    Object obj2 = null;
                    String emjUrl = gifListJson.getFolderName() + (gifConfigJsonOooOOO3 != null ? gifConfigJsonOooOOO3.getGif() : null);
                    this$0.getClass();
                    for (Object obj3 : com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48585OooOO0O) {
                        long jLongValue = ((oo00) obj3).f55307OooO0OO.getValue().longValue();
                        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                        Long l = (Long) o0O00oO0.OooOOo0().getValue();
                        if (l != null && jLongValue == l.longValue()) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    oo00 oo00Var = (oo00) obj2;
                    if (oo00Var != null) {
                        int i3 = oo00Var.f55305OooO00o + 1;
                        Intrinsics.checkNotNullParameter(emjUrl, "emjUrl");
                        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                        if (roomLiveService != null) {
                            roomLiveService.OooO0oO(1000400, "{\"type\":2,\"emjUrl\":\"" + emjUrl + "\",\"micNumber\":" + i3 + "}");
                        }
                        this$0.OooO0O0();
                    }
                }
            };
        }
    }

    public final class OooO0O0 extends o0000oo<GifListJson> {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ oOO0Oo00 f58982OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull oOO0Oo00 ooo0oo00, @NotNull Context context, List<GifListJson> data) {
            super(oo0o0Oo.room_item_mic_emoji_panel_table, context, data);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f58982OooOoo0 = ooo0oo00;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            GifListJson gifListJson = (GifListJson) obj;
            if (viewHolder == null || gifListJson == null) {
                return;
            }
            viewHolder.setGone(o0OO00O.vSelect, this.f58982OooOoo0.f58977OooOO0o == viewHolder.getLayoutPosition());
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f56423OooOo);
            oooO00o.f43140OooOOo0 = o0000.OooO0O0(o0Oo0oo.icon_emoji);
            oooO00o.f43126OooO0OO = OooOOOO.OooO00o(p184o00o00O0.OooO0OO.OooO0Oo(gifListJson.getFolderName()), gifListJson.getFolderIcon());
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(o0OO00O.ivItemEmojiTable));
            viewHolder.setGone(o0OO00O.vSplitLine, viewHolder.getLayoutPosition() != getItemCount() - 1);
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f58983OooO0Oo;

        public OooO0OO(ooooO0O0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f58983OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f58983OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f58983OooO0Oo;
        }

        public final int hashCode() {
            return this.f58983OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f58983OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0Oo00(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        l lVarInflate = l.inflate(LayoutInflater.from(context), this.f58508OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(lVarInflate, "inflate(...)");
        this.f58976OooOO0O = lVarInflate;
        FrameLayout frameLayout = lVarInflate.f44102OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        OooO0oO(frameLayout);
        Window window = this.f58509OooO0o0.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        Window window2 = this.f58509OooO0o0.getWindow();
        if (window2 != null) {
            window2.setWindowAnimations(o000000O.anim_bottom_top_bottom);
        }
        if (this.f58507OooO0Oo instanceof FragmentActivity) {
            OooOO0O.f45930OooO00o.observe(this.f58509OooO0o0, new OooO0OO(new ooooO0O0(this)));
            final int[] iArr = new int[2];
            lVarInflate.f44102OooO00o.setOnTouchListener(new View.OnTouchListener() { // from class: o0ooo.oOO0O0O0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    oOO0Oo00 this$0 = this.f58963OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    int[] location = iArr;
                    Intrinsics.checkNotNullParameter(location, "$location");
                    this$0.f58976OooOO0O.f44103OooO0O0.getLocationOnScreen(location);
                    if (view.getY() >= location[1]) {
                        return false;
                    }
                    this$0.OooO0O0();
                    return false;
                }
            });
        }
    }

    public static final void OooOO0(oOO0Oo00 ooo0oo00, List list) {
        l lVar = ooo0oo00.f58976OooOO0O;
        CrossRecyclerView crossRecyclerView = lVar.f44103OooO0O0;
        Context context = ooo0oo00.f58507OooO0Oo;
        crossRecyclerView.setLayoutManager(new FixLinearLayoutManager(context, 0));
        OooO00o oooO00o = new OooO00o(ooo0oo00, context, list);
        CrossRecyclerView crossRecyclerView2 = lVar.f44103OooO0O0;
        crossRecyclerView2.setAdapter(oooO00o);
        androidx.recyclerview.widget.o000000 o000000Var = new androidx.recyclerview.widget.o000000();
        crossRecyclerView2.setOnFlingListener(null);
        o000000Var.attachToRecyclerView(crossRecyclerView2);
        crossRecyclerView2.addOnScrollListener(new oOO0OoO0(ooo0oo00));
    }

    public static final boolean OooOO0O(oOO0Oo00 ooo0oo00, View view, MotionEvent motionEvent) {
        ooo0oo00.getClass();
        if (view == null) {
            return false;
        }
        float x = view.getX();
        float x2 = view.getX() + view.getWidth();
        float x3 = motionEvent.getX();
        if (!(x <= x3 && x3 <= x2)) {
            return false;
        }
        float y = view.getY();
        float y2 = view.getY() + view.getHeight();
        float y3 = motionEvent.getY();
        return (y > y3 ? 1 : (y == y3 ? 0 : -1)) <= 0 && (y3 > y2 ? 1 : (y3 == y2 ? 0 : -1)) <= 0;
    }

    public static final void OooOO0o(oOO0Oo00 ooo0oo00, View view, String str, String str2, int i) {
        int height;
        int measuredHeight;
        int i2 = oo0o0Oo.room_popupwindow_mic_emoji;
        Context context = ooo0oo00.f58507OooO0Oo;
        g1 g1Var = null;
        g1 g1VarOooO00o = g1.OooO00o(View.inflate(context, i2, null));
        Intrinsics.checkNotNullExpressionValue(g1VarOooO00o, "bind(...)");
        ooo0oo00.f58980OooOOOO = g1VarOooO00o;
        oOO ooo = new oOO(ooo0oo00, g1VarOooO00o.f43872OooO00o);
        ooo0oo00.f58978OooOOO = ooo;
        ooo.setClippingEnabled(true);
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(context);
        oooO00o.f43127OooO0Oo = true;
        oooO00o.OooO0o0(8);
        oooO00o.f43126OooO0OO = OooOOOO.OooO00o(p184o00o00O0.OooO0OO.OooO0Oo(str2), str);
        oooO00o.f43124OooO00o = 0;
        g1 g1Var2 = ooo0oo00.f58980OooOOOO;
        if (g1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            g1Var2 = null;
        }
        oooO00o.OooO0Oo(g1Var2.f43873OooO0O0);
        g1 g1Var3 = ooo0oo00.f58980OooOOOO;
        if (g1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            g1Var3 = null;
        }
        g1Var3.f43872OooO00o.measure(0, 0);
        int width = view.getWidth();
        g1 g1Var4 = ooo0oo00.f58980OooOOOO;
        if (g1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            g1Var4 = null;
        }
        int measuredWidth = (width - g1Var4.f43872OooO00o.getMeasuredWidth()) / 2;
        if (i <= 0) {
            height = o0000O0.OooO00o(4) - view.getHeight();
            g1 g1Var5 = ooo0oo00.f58980OooOOOO;
            if (g1Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            } else {
                g1Var = g1Var5;
            }
            measuredHeight = g1Var.f43872OooO00o.getMeasuredHeight();
        } else {
            height = i - view.getHeight();
            g1 g1Var6 = ooo0oo00.f58980OooOOOO;
            if (g1Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            } else {
                g1Var = g1Var6;
            }
            measuredHeight = g1Var.f43872OooO00o.getMeasuredHeight();
        }
        int i3 = height - measuredHeight;
        PopupWindow popupWindow = ooo0oo00.f58978OooOOO;
        if (popupWindow != null) {
            popupWindow.showAsDropDown(view, measuredWidth, i3, 0);
        }
    }
}
