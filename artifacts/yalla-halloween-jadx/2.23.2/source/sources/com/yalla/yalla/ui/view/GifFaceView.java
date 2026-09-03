package com.yalla.yalla.ui.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.gift.GifConfigJson;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.ui.view.GifFaceView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;
import p587o0oOooOO.q;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J@\u0010\u000e\u001a\u00020\u000428\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/ui/view/GifFaceView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lo0oOooOO/q;", "gifFace", "", "setGifData", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "gifUrl", "", "gifid", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSendGIFMessageListener", "Lkotlin/Function0;", "OooOOO0", "Lkotlin/jvm/functions/Function0;", "getBuyGifCallBack", "()Lkotlin/jvm/functions/Function0;", "setBuyGifCallBack", "(Lkotlin/jvm/functions/Function0;)V", "buyGifCallBack", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO0O0", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class GifFaceView extends RecyclerView {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f29903OooOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f29904OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO00o f29905OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public String f29906OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super Integer, Unit> f29907OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f29908OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public GifListJson f29909OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f29910OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final ArrayList f29911OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public View f29912OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> buyGifCallBack;

    public static final class OooO00o extends o0000oo<GifConfigJson> {

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ GifFaceView f29914OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ Context f29915OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, GifFaceView gifFaceView, int i) {
            super(context, i);
            this.f29915OooOoo0 = context;
            this.f29914OooOoo = gifFaceView;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            GifConfigJson gifConfigJson = (GifConfigJson) obj;
            if (viewHolder == null || gifConfigJson == null) {
                return;
            }
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f29915OooOoo0);
            GifFaceView gifFaceView = this.f29914OooOoo;
            String str = gifFaceView.f29906OooO0o;
            oooO00o.f43126OooO0OO = OooOOOO.OooO00o(str != null ? p184o00o00O0.OooO0OO.OooO0Oo(str) : null, gifConfigJson.getPng());
            boolean z = false;
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(o0OO00O.iv_face));
            viewHolder.setText(o0OO00O.tvGifFaceName, gifConfigJson.getName());
            int i = o0OO00O.llRoot;
            viewHolder.getView(i).setTag(o0OO00O.face_position, Integer.valueOf(viewHolder.getLayoutPosition()));
            viewHolder.addOnLongClickListener(i);
            GifListJson gifListJson = gifFaceView.f29909OooO0oo;
            if (gifListJson != null && gifListJson.canNotUse()) {
                z = true;
            }
            if (z) {
                View view = viewHolder.getView(o0OO00O.iv_lock);
                Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
                o000O.OooOOOO(view);
            } else {
                View view2 = viewHolder.getView(o0OO00O.iv_lock);
                Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
                o000O.OooO0O0(view2);
            }
        }
    }

    public final class OooO0O0 extends PopupWindow {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final /* synthetic */ int f29916OooO0OO = 0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Context f29917OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final NetImageView f29918OooO0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.f29917OooO00o = context;
            setContentView(View.inflate(context, oo0o0Oo.gif_popup, null));
            View viewFindViewById = getContentView().findViewById(o0OO00O.nivGif);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            NetImageView netImageView = (NetImageView) viewFindViewById;
            this.f29918OooO0O0 = netImageView;
            setBackgroundDrawable(new ColorDrawable());
            netImageView.setOnClickListener(new com.facebook.OooO0o(this, 1));
            setOutsideTouchable(true);
            setFocusable(true);
        }

        public final void OooO00o(@NotNull View view, @NotNull String gifUrl) {
            Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
            Intrinsics.checkNotNullParameter(view, "view");
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f29917OooO00o);
            oooO00o.f43126OooO0OO = gifUrl;
            oooO00o.f43124OooO00o = 0;
            oooO00o.f43127OooO0Oo = true;
            oooO00o.OooO0o0(8);
            oooO00o.OooO0Oo(this.f29918OooO0O0);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            showAtLocation(view, 0, ((view.getWidth() - o0000O0.OooO00o(130.0f)) / 2) + iArr[0], iArr[1] - o0000O0.OooO00o(130.0f));
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f29919OooO0Oo;

        public OooO0OO(OooO0o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29919OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f29919OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f29919OooO0Oo;
        }

        public final int hashCode() {
            return this.f29919OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29919OooO0Oo.invoke(obj);
        }
    }

    @SourceDebugExtension({"SMAP\nGifFaceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifFaceView.kt\ncom/yalla/yalla/ui/view/GifFaceView$setGifData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n1#2:195\n*E\n"})
    public static final class OooO0o extends Lambda implements Function1<GifListJson, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GifListJson gifListJson) {
            GifListJson gifListJson2 = gifListJson;
            String folderName = gifListJson2.getFolderName();
            GifFaceView gifFaceView = GifFaceView.this;
            gifFaceView.f29906OooO0o = folderName;
            gifFaceView.f29909OooO0oo = gifListJson2;
            gifFaceView.f29905OooO0Oo.OooOoO0(gifListJson2.getItem());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GifFaceView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static boolean OooO0O0(View view, MotionEvent motionEvent) {
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

    public final void OooO0OO(boolean z, MotionEvent motionEvent) {
        try {
            if (!z) {
                this.f29912OooOO0o = null;
                OooO0O0 oooO0O0 = this.f29908OooO0oO;
                if (oooO0O0 != null) {
                    oooO0O0.dismiss();
                    return;
                }
                return;
            }
            ArrayList arrayList = this.f29911OooOO0O;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (OooO0O0(view, motionEvent) && !OooO0O0(this.f29912OooOO0o, motionEvent)) {
                    Object tag = view.getTag(o0OO00O.face_position);
                    Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                    Object obj = this.f29905OooO0Oo.f13189OooOOoo.get(((Integer) tag).intValue());
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.gift.GifConfigJson");
                    GifConfigJson gifConfigJson = (GifConfigJson) obj;
                    this.f29912OooOO0o = view;
                    OooO0O0 oooO0O1 = this.f29908OooO0oO;
                    if (oooO0O1 != null) {
                        oooO0O1.dismiss();
                    }
                    this.f29908OooO0oO = null;
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    OooO0O0 oooO0O2 = new OooO0O0(context);
                    this.f29908OooO0oO = oooO0O2;
                    String str = this.f29906OooO0o;
                    String strOooO0Oo = str != null ? p184o00o00O0.OooO0OO.OooO0Oo(str) : null;
                    oooO0O2.OooO00o(view, strOooO0Oo + gifConfigJson.getGif());
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
            if (this.f29904OooO) {
                return super.dispatchTouchEvent(motionEvent);
            }
            OooO0OO(true, motionEvent);
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        OooO0O0 oooO0O0 = this.f29908OooO0oO;
        if (oooO0O0 != null) {
            oooO0O0.dismiss();
        }
        this.f29904OooO = true;
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

    public final void setGifData(@NotNull q gifFace) {
        Intrinsics.checkNotNullParameter(gifFace, "gifFace");
        MutableLiveData<GifListJson> mutableLiveData = gifFace.f56935OooO0O0;
        if (mutableLiveData != null) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            mutableLiveData.observe((AppCompatActivity) context, new OooO0OO(new OooO0o()));
        }
    }

    public final void setOnSendGIFMessageListener(@Nullable Function2<? super String, ? super Integer, Unit> listener) {
        this.f29907OooO0o0 = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GifFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GifFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29904OooO = true;
        this.f29911OooOO0O = new ArrayList();
        setLayoutManager(new GridLayoutManager(context, 4));
        final OooO00o oooO00o = new OooO00o(context, this, oo0o0Oo.item_sticker_face);
        oooO00o.OooOoOO(true);
        oooO00o.f13176OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0oOooOO.j0
            /* JADX WARN: Code duplicated, block: B:10:0x002d  */
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                boolean z;
                int i3 = GifFaceView.f29903OooOOO;
                GifFaceView this$0 = this.f56847OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GifFaceView.OooO00o this_apply = oooO00o;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this$0.f29910OooOO0 < 700) {
                    return;
                }
                this$0.f29910OooOO0 = jCurrentTimeMillis;
                GifListJson gifListJson = this$0.f29909OooO0oo;
                if (gifListJson != null) {
                    z = gifListJson.canNotUse();
                }
                if (z) {
                    Function0<Unit> function0 = this$0.buyGifCallBack;
                    if (function0 != null) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                GifConfigJson gifConfigJson = (GifConfigJson) this_apply.f13189OooOOoo.get(i2);
                Function2<? super String, ? super Integer, Unit> function2 = this$0.f29907OooO0o0;
                if (function2 != null) {
                    function2.invoke(OooOOOO.OooO00o(this$0.f29906OooO0o, gifConfigJson.getGif()), Integer.valueOf(gifConfigJson.getId()));
                }
            }
        };
        oooO00o.f13171OooO = new BaseQuickAdapter.OooO0OO() { // from class: o0oOooOO.k0
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0OO
            public final void OooO00o(View view, int i2) {
                int i3 = GifFaceView.f29903OooOOO;
                GifFaceView this$0 = this.f56855OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f29911OooOO0O.clear();
                int childCount = this$0.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this$0.getChildAt(i4);
                    ArrayList arrayList = this$0.f29911OooOO0O;
                    Intrinsics.checkNotNull(childAt);
                    arrayList.add(childAt);
                }
                this$0.f29904OooO = false;
            }
        };
        this.f29905OooO0Oo = oooO00o;
        setOverScrollMode(2);
        setClipToPadding(false);
        setPaddingRelative(o0000O0.OooO00o(0.0f), o0000O0.OooO00o(0.0f), o0000O0.OooO00o(0.0f), o0000O0.OooO00o(16.0f));
        setAdapter(oooO00o);
    }

    public /* synthetic */ GifFaceView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
