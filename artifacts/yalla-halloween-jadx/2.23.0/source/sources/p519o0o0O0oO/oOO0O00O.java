package p519o0o0O0oO;

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
import androidx.recyclerview.widget.o000OOo;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.yalla.yalla.model.gift.GifConfigJson;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.service.room.OooO00o;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139o00OOooO.OooO0o;
import p157o00OoOO0.o0OO00O;
import p362o0OOo0O.OooOO0;
import p412o0Oo0oOo.s0;
import p464o0Oooo.o000000O;
import p533o0o0Oo0.oo0O;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO00Oo00;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.r9;
import p641o0ooOOOO.y7;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMicEmojiPanelDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MicEmojiPanelDialog.kt\ncom/yalla/yalla/ui/dialog/MicEmojiPanelDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,327:1\n1#2:328\n*E\n"})
public final class oOO0O00O extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final y7 f52969OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f52970OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public PopupWindow f52971OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OooO0O0 f52972OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public r9 f52973OooOOOO;

    public final class OooO00o extends o000O<GifListJson> {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ oOO0O00O f52974OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull oOO0O00O ooo0o00o, @NotNull Context context, List<GifListJson> data) {
            super(oO00OO0O.room_item_mic_emoji_panel_content, context, data);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f52974OooOoo0 = ooo0o00o;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            final GifListJson gifListJson = (GifListJson) obj;
            if (viewHolder == null || gifListJson == null) {
                return;
            }
            final int[] iArr = {0, 0};
            final GifRecyclerView gifRecyclerView = (GifRecyclerView) viewHolder.getView(oO00O0oO.rvItemEmojiPanel);
            final ArrayList arrayList = new ArrayList();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            int i = oO00OO0O.room_item_mic_emoji_panel;
            List<GifConfigJson> item = gifListJson.getItem();
            Context context = this.f56196OooOo;
            final oOO0O000 ooo0o000 = new oOO0O000(gifListJson, context, i, item);
            gifRecyclerView.setLayoutManager(new GridLayoutManager(context, 4));
            gifRecyclerView.setAdapter(ooo0o000);
            gifRecyclerView.setLongClickPreviewListener(new oOO0(gifListJson, ooo0o000, this.f52974OooOoo0, gifRecyclerView, arrayList, objectRef, iArr));
            final oOO0O00O ooo0o00o = this.f52974OooOoo0;
            ooo0o000.f10093OooO = new BaseQuickAdapter.OooO0OO() { // from class: o0o0O0oO.oOO00OO
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0OO
                public final void OooO0O0(View view, int i2) {
                    String gif;
                    List itemViewList = arrayList;
                    Intrinsics.checkNotNullParameter(itemViewList, "$itemViewList");
                    oOO0O000 adapter = ooo0o000;
                    Intrinsics.checkNotNullParameter(adapter, "$adapter");
                    Ref.ObjectRef lastView = objectRef;
                    Intrinsics.checkNotNullParameter(lastView, "$lastView");
                    int[] rvLocal = iArr;
                    Intrinsics.checkNotNullParameter(rvLocal, "$rvLocal");
                    oOO0O00O this$0 = ooo0o00o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    itemViewList.clear();
                    GifRecyclerView gifRecyclerView2 = gifRecyclerView;
                    int childCount = gifRecyclerView2.getChildCount();
                    boolean z = false;
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childView = gifRecyclerView2.getChildAt(i3);
                        Intrinsics.checkNotNullExpressionValue(childView, "childView");
                        itemViewList.add(childView);
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
                        Intrinsics.checkNotNullExpressionValue(view, "view");
                        if (gifConfigJsonOooOOO == null || (gif = gifConfigJsonOooOOO.getGif()) == null) {
                            gif = "";
                        }
                        oOO0O00O.OooOO0o(this$0, view, gif, gifListJson.getFolderName(), i6);
                    }
                }
            };
            ooo0o000.f10098OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0o0O0oO.ooooO000
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
                public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                    oOO0O000 adapter = ooo0o000;
                    Intrinsics.checkNotNullParameter(adapter, "$adapter");
                    oOO0O00O this$0 = ooo0o00o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    GifConfigJson gifConfigJsonOooOOO = adapter.OooOOO(i2);
                    int lowestKAVIP = gifConfigJsonOooOOO != null ? gifConfigJsonOooOOO.getLowestKAVIP() : 0;
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    Pair pair = (Pair) o000000O.OooOO0().getValue();
                    int iIntValue = pair != null ? ((Number) pair.getSecond()).intValue() : 0;
                    GifConfigJson gifConfigJsonOooOOO2 = adapter.OooOOO(i2);
                    int lowestVip = gifConfigJsonOooOOO2 != null ? gifConfigJsonOooOOO2.getLowestVip() : 0;
                    Pair pair2 = (Pair) o000000O.OooOO0o().getValue();
                    boolean zBooleanValue = pair2 != null ? ((Boolean) pair2.getFirst()).booleanValue() : false;
                    Pair pair3 = (Pair) o000000O.OooOO0o().getValue();
                    int iIntValue2 = pair3 != null ? ((Number) pair3.getSecond()).intValue() : 0;
                    if (lowestKAVIP > 0 && iIntValue < lowestKAVIP) {
                        o0OO00O o0oo00o2 = new o0OO00O(this$0.f52532OooO0Oo);
                        o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.room_mic_emoji_upgrade_ka_vip_content));
                        o0oo00o2.OooOo(true);
                        o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.room_mic_emoji_upgrade_ka_vip_dredge));
                        o0oo00o2.OooOo0(oOO0OO0O.f52980OooO0Oo);
                        o0oo00o2.OooOO0o();
                        return;
                    }
                    if ((!zBooleanValue || iIntValue2 < lowestVip) && lowestVip > 0) {
                        o0OO00O o0oo00o3 = new o0OO00O(this$0.f52532OooO0Oo);
                        o0oo00o3.OooOo00(o0000.OooO0OO(oO00OOo0.room_mic_emoji_upgrade_vip_content));
                        o0oo00o3.OooOo(true);
                        o0oo00o3.OooOOOo(o0000.OooO0OO(oO00OOo0.Get_Yalla_Premium));
                        o0oo00o3.OooOo0(new oOO0OO(o0oo00o3));
                        o0oo00o3.OooOO0o();
                        return;
                    }
                    GifConfigJson gifConfigJsonOooOOO3 = adapter.OooOOO(i2);
                    Pair[] pairArr = new Pair[1];
                    pairArr[0] = new Pair("emotiid", gifConfigJsonOooOOO3 != null ? Integer.valueOf(gifConfigJsonOooOOO3.getId()) : "");
                    o0OO000.OooO0O0("102033", MapsKt.hashMapOf(pairArr));
                    Object obj2 = null;
                    String emjUrl = gifListJson.getFolderName() + (gifConfigJsonOooOOO3 != null ? gifConfigJsonOooOOO3.getGif() : null);
                    this$0.getClass();
                    for (Object obj3 : OooO00o.f24979OooO0oO.f47380OooOO0O) {
                        long jLongValue = ((oo0O) obj3).f54838OooO0OO.getValue().longValue();
                        o000000O o000000o3 = o000000O.f46674OooO00o;
                        Long l = (Long) o000000O.OooOOo0().getValue();
                        if (l != null && jLongValue == l.longValue()) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    oo0O oo0o = (oo0O) obj2;
                    if (oo0o != null) {
                        int i3 = oo0o.f54836OooO00o + 1;
                        Intrinsics.checkNotNullParameter(emjUrl, "emjUrl");
                        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                        if (roomLiveService != null) {
                            roomLiveService.OooO0oO(1000400, "{\"type\":2,\"emjUrl\":\"" + emjUrl + "\",\"micNumber\":" + i3 + "}");
                        }
                        this$0.OooO0O0();
                    }
                }
            };
        }
    }

    public final class OooO0O0 extends o000O<GifListJson> {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ oOO0O00O f52975OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull oOO0O00O ooo0o00o, @NotNull Context context, List<GifListJson> data) {
            super(oO00OO0O.room_item_mic_emoji_panel_table, context, data);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f52975OooOoo0 = ooo0o00o;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            GifListJson gifListJson = (GifListJson) obj;
            if (viewHolder == null || gifListJson == null) {
                return;
            }
            viewHolder.setGone(oO00O0oO.vSelect, this.f52975OooOoo0.f52970OooOO0o == viewHolder.getLayoutPosition());
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f56196OooOo);
            oooO00o.f43925OooOOo0 = o0000.OooO0O0(oOo00OO0.icon_emoji);
            oooO00o.f43911OooO0OO = OooOOOO.OooO00o(OooO0o.OooO0Oo(gifListJson.getFolderName()), gifListJson.getFolderIcon());
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.ivItemEmojiTable));
            viewHolder.setGone(oO00O0oO.vSplitLine, viewHolder.getLayoutPosition() != getItemCount() - 1);
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f52976OooO0Oo;

        public OooO0OO(oOO0O0O0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f52976OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f52976OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f52976OooO0Oo;
        }

        public final int hashCode() {
            return this.f52976OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52976OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O00O(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        y7 y7VarInflate = y7.inflate(LayoutInflater.from(context), this.f52533OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(y7VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
        this.f52969OooOO0O = y7VarInflate;
        FrameLayout frameLayout = y7VarInflate.f59397OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "emojiPanelBinding.root");
        OooO0oO(frameLayout);
        Window window = this.f52534OooO0o0.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        Window window2 = this.f52534OooO0o0.getWindow();
        if (window2 != null) {
            window2.setWindowAnimations(oO00Oo00.anim_bottom_top_bottom);
        }
        if (this.f52532OooO0Oo instanceof FragmentActivity) {
            s0.f45256OooO00o.observe(this.f52534OooO0o0, new OooO0OO(new oOO0O0O0(this)));
            final int[] iArr = new int[2];
            y7VarInflate.f59397OooO00o.setOnTouchListener(new View.OnTouchListener() { // from class: o0o0O0oO.oOO00O0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    oOO0O00O this$0 = this.f52958OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    int[] location = iArr;
                    Intrinsics.checkNotNullParameter(location, "$location");
                    this$0.f52969OooOO0O.f59398OooO0O0.getLocationOnScreen(location);
                    if (view.getY() >= location[1]) {
                        return false;
                    }
                    this$0.OooO0O0();
                    return false;
                }
            });
        }
    }

    public static final void OooOO0(oOO0O00O ooo0o00o, List list) {
        y7 y7Var = ooo0o00o.f52969OooOO0O;
        CrossRecyclerView crossRecyclerView = y7Var.f59398OooO0O0;
        Context context = ooo0o00o.f52532OooO0Oo;
        crossRecyclerView.setLayoutManager(new FixLinearLayoutManager(context, 0));
        OooO00o oooO00o = new OooO00o(ooo0o00o, context, list);
        CrossRecyclerView crossRecyclerView2 = y7Var.f59398OooO0O0;
        crossRecyclerView2.setAdapter(oooO00o);
        o000OOo o000ooo2 = new o000OOo();
        crossRecyclerView2.setOnFlingListener(null);
        o000ooo2.attachToRecyclerView(crossRecyclerView2);
        crossRecyclerView2.addOnScrollListener(new oOO0O0(ooo0o00o));
    }

    public static final boolean OooOO0O(oOO0O00O ooo0o00o, View view, MotionEvent motionEvent) {
        ooo0o00o.getClass();
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

    public static final void OooOO0o(oOO0O00O ooo0o00o, View view, String str, String str2, int i) {
        int height;
        int measuredHeight;
        int i2 = oO00OO0O.room_popupwindow_mic_emoji;
        Context context = ooo0o00o.f52532OooO0Oo;
        r9 r9Var = null;
        r9 r9VarOooO00o = r9.OooO00o(View.inflate(context, i2, null));
        Intrinsics.checkNotNullExpressionValue(r9VarOooO00o, "bind(FrameLayout.inflate…pwindow_mic_emoji, null))");
        ooo0o00o.f52973OooOOOO = r9VarOooO00o;
        oOO0O0O ooo0o0o = new oOO0O0O(ooo0o00o, r9VarOooO00o.f58758OooO00o);
        ooo0o00o.f52971OooOOO = ooo0o0o;
        ooo0o0o.setClippingEnabled(true);
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(context);
        oooO00o.f43912OooO0Oo = true;
        oooO00o.OooO0o0(8);
        oooO00o.f43911OooO0OO = OooOOOO.OooO00o(OooO0o.OooO0Oo(str2), str);
        oooO00o.f43909OooO00o = 0;
        r9 r9Var2 = ooo0o00o.f52973OooOOOO;
        if (r9Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            r9Var2 = null;
        }
        oooO00o.OooO0Oo(r9Var2.f58759OooO0O0);
        r9 r9Var3 = ooo0o00o.f52973OooOOOO;
        if (r9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            r9Var3 = null;
        }
        r9Var3.f58758OooO00o.measure(0, 0);
        int width = view.getWidth();
        r9 r9Var4 = ooo0o00o.f52973OooOOOO;
        if (r9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            r9Var4 = null;
        }
        int measuredWidth = (width - r9Var4.f58758OooO00o.getMeasuredWidth()) / 2;
        if (i <= 0) {
            height = o0000O0.OooO00o(4) - view.getHeight();
            r9 r9Var5 = ooo0o00o.f52973OooOOOO;
            if (r9Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            } else {
                r9Var = r9Var5;
            }
            measuredHeight = r9Var.f58758OooO00o.getMeasuredHeight();
        } else {
            height = i - view.getHeight();
            r9 r9Var6 = ooo0o00o.f52973OooOOOO;
            if (r9Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            } else {
                r9Var = r9Var6;
            }
            measuredHeight = r9Var.f58758OooO00o.getMeasuredHeight();
        }
        int i3 = height - measuredHeight;
        PopupWindow popupWindow = ooo0o00o.f52971OooOOO;
        if (popupWindow != null) {
            popupWindow.showAsDropDown(view, measuredWidth, i3, 0);
        }
    }
}
