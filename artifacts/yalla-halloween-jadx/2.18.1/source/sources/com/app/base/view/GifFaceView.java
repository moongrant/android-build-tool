package com.app.base.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.GifFaceView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.model.GifConfigJson;
import com.yalla.yalla.model.GifListJson;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p044OooooOO.o00O000;
import p142o00OOooO.o000O0;
import p254o00ooO0O.oOO00O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J@\u0010\u000e\u001a\u00020\u000428\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/app/base/view/GifFaceView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/app/base/view/FacePanelView$OooO0O0;", "gifFace", "", "setGifData", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "gifUrl", "", "gifid", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSendGIFMessageListener", "Lkotlin/Function0;", "o000oOoO", "Lkotlin/jvm/functions/Function0;", "getBuyGifCallBack", "()Lkotlin/jvm/functions/Function0;", "setBuyGifCallBack", "(Lkotlin/jvm/functions/Function0;)V", "buyGifCallBack", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attr", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO0O0", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GifFaceView extends RecyclerView {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f12026OoooOOO = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public OooO0O0 f12027Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final p188o00o00o0.OooO0OO<GifConfigJson> f12028Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super Integer, Unit> f12029Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public String f12030Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final List<View> f12031OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f12032OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public GifListJson f12033OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public long f12034OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public View f12035OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> buyGifCallBack;

    public static final class OooO00o extends p188o00o00o0.OooO0OO<GifConfigJson> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Context f12037OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ GifFaceView f12038OooO0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, GifFaceView gifFaceView) {
            super(context, R.layout.item_sticker_face);
            this.f12037OooO00o = context;
            this.f12038OooO0O0 = gifFaceView;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            GifConfigJson gifConfigJson = (GifConfigJson) obj;
            if (oooO0o == null || gifConfigJson == null) {
                return;
            }
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f12037OooO00o);
            StringBuilder sb = new StringBuilder();
            String str = this.f12038OooO0O0.f12030Oooo0oo;
            sb.append(str != null ? CloudImageUtilKt.imgFormat(str) : null);
            sb.append(gifConfigJson.getPng());
            oooO00o2.f48429OooO0OO = sb.toString();
            boolean z = false;
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.iv_face));
            oooO0o.OooOO0(R.id.tvGifFaceName, gifConfigJson.getName());
            oooO0o.OooO0Oo(R.id.llRoot).setTag(R.id.face_position, Integer.valueOf(oooO0o.getLayoutPosition()));
            oooO0o.OooO0OO();
            GifListJson gifListJson = this.f12038OooO0O0.f12033OoooO00;
            if (gifListJson != null && gifListJson.canNotUse()) {
                z = true;
            }
            if (z) {
                View viewOooO0Oo = oooO0o.OooO0Oo(R.id.iv_lock);
                Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "helper.getView<View>(R.id.iv_lock)");
                oOO00O.OooO(viewOooO0Oo);
            } else {
                View viewOooO0Oo2 = oooO0o.OooO0Oo(R.id.iv_lock);
                Intrinsics.checkNotNullExpressionValue(viewOooO0Oo2, "helper.getView<View>(R.id.iv_lock)");
                oOO00O.OooO00o(viewOooO0Oo2);
            }
        }
    }

    public final class OooO0O0 extends PopupWindow {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final /* synthetic */ int f12039OooO0OO = 0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Context f12040OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final NetImageView f12041OooO0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.f12040OooO00o = context;
            setContentView(View.inflate(context, R.layout.gif_popup, null));
            View viewFindViewById = getContentView().findViewById(R.id.nivGif);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "contentView.findViewById(R.id.nivGif)");
            NetImageView netImageView = (NetImageView) viewFindViewById;
            this.f12041OooO0O0 = netImageView;
            setBackgroundDrawable(new ColorDrawable());
            netImageView.setOnClickListener(new o00OO0O0.OooO0O0(this, 1));
            setOutsideTouchable(true);
            setFocusable(true);
        }

        public final void OooO00o(@NotNull String gifUrl, @NotNull View view) {
            Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
            Intrinsics.checkNotNullParameter(view, "view");
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f12040OooO00o);
            oooO00o.f48429OooO0OO = gifUrl;
            oooO00o.f48427OooO00o = 0;
            oooO00o.f48430OooO0Oo = true;
            oooO00o.OooO0oO(8);
            oooO00o.OooO0o(this.f12041OooO0O0);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            showAtLocation(view, 0, ((view.getWidth() - OooOo00.OooO00o(130.0f)) / 2) + iArr[0], iArr[1] - OooOo00.OooO00o(130.0f));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GifFaceView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean OooO00o(View view, MotionEvent motionEvent) {
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

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    public final void OooO0OO(boolean z, MotionEvent motionEvent) {
        try {
            if (!z) {
                this.f12035OoooOO0 = null;
                OooO0O0 oooO0O0 = this.f12027Oooo;
                if (oooO0O0 != null) {
                    oooO0O0.dismiss();
                    return;
                }
                return;
            }
            int size = this.f12031OoooO.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f12031OoooO.get(i);
                if (OooO00o(view, motionEvent) && !OooO00o(this.f12035OoooOO0, motionEvent)) {
                    Object tag = view.getTag(R.id.face_position);
                    Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                    GifConfigJson gifConfigJson = this.f12028Oooo0o.getData().get(((Integer) tag).intValue());
                    Intrinsics.checkNotNull(gifConfigJson, "null cannot be cast to non-null type com.yalla.yalla.model.GifConfigJson");
                    GifConfigJson gifConfigJson2 = gifConfigJson;
                    this.f12035OoooOO0 = view;
                    OooO0O0 oooO0O1 = this.f12027Oooo;
                    if (oooO0O1 != null) {
                        oooO0O1.dismiss();
                    }
                    this.f12027Oooo = null;
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    OooO0O0 oooO0O2 = new OooO0O0(context);
                    this.f12027Oooo = oooO0O2;
                    StringBuilder sb = new StringBuilder();
                    String str = this.f12030Oooo0oo;
                    sb.append(str != null ? CloudImageUtilKt.imgFormat(str) : null);
                    sb.append(gifConfigJson2.getGif());
                    oooO0O2.OooO00o(sb.toString(), view);
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (this.f12032OoooO0) {
                return super.dispatchTouchEvent(motionEvent);
            }
            OooO0OO(true, motionEvent);
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        OooO0O0 oooO0O0 = this.f12027Oooo;
        if (oooO0O0 != null) {
            oooO0O0.dismiss();
        }
        this.f12032OoooO0 = true;
        OooO0OO(false, motionEvent);
        getParent().requestDisallowInterceptTouchEvent(false);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public final Function0<Unit> getBuyGifCallBack() {
        return this.buyGifCallBack;
    }

    public final void setBuyGifCallBack(@Nullable Function0<Unit> function0) {
        this.buyGifCallBack = function0;
    }

    public final void setGifData(@NotNull FacePanelView.OooO0O0 gifFace) {
        Intrinsics.checkNotNullParameter(gifFace, "gifFace");
        MutableLiveData<GifListJson> mutableLiveData = gifFace.f11973OooO0O0;
        if (mutableLiveData != null) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            mutableLiveData.observe((AppCompatActivity) context, new o00O000(this, 2));
        }
    }

    public final void setOnSendGIFMessageListener(@Nullable Function2<? super String, ? super Integer, Unit> listener) {
        this.f12029Oooo0oO = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GifFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GifFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12032OoooO0 = true;
        this.f12031OoooO = new ArrayList();
        setLayoutManager(new GridLayoutManager(context, 4));
        final OooO00o oooO00o = new OooO00o(context, this);
        oooO00o.hindEmptyView(true);
        oooO00o.setOnItemClickListener(new BaseQuickAdapter.OooOOOO() { // from class: o00OooOo.o0OO00OO
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                GifFaceView this$0 = this.f32738OooO0Oo;
                GifFaceView.OooO00o this_apply = oooO00o;
                int i3 = GifFaceView.f12026OoooOOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this$0.f12034OoooO0O < 700) {
                    return;
                }
                this$0.f12034OoooO0O = jCurrentTimeMillis;
                GifListJson gifListJson = this$0.f12033OoooO00;
                if (gifListJson != null && gifListJson.canNotUse()) {
                    Function0<Unit> function0 = this$0.buyGifCallBack;
                    if (function0 != null) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                GifConfigJson gifConfigJson = this_apply.getData().get(i2);
                Function2<? super String, ? super Integer, Unit> function2 = this$0.f12029Oooo0oO;
                if (function2 != null) {
                    function2.invoke(this$0.f12030Oooo0oo + gifConfigJson.getGif(), Integer.valueOf(gifConfigJson.getId()));
                }
            }
        });
        oooO00o.setOnItemChildLongClickListener(new o000O0(this));
        this.f12028Oooo0o = oooO00o;
        setOverScrollMode(2);
        setClipToPadding(false);
        setAdapter(oooO00o);
    }
}
