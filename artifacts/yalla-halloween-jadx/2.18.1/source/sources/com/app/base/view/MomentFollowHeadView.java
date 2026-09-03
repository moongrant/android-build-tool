package com.app.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p175o00OooOo.o0OO0O0;
import p649o0ooOOoo.qd;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\b\u001a\u00020\u00062 \u0010\u0007\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/app/base/view/MomentFollowHeadView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function2;", "", "Lcom/yalla/yalla/model/RecommendNewPostModel;", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "setVisibilityFollowUserHead", "setVisibilityReCommentHead", "data", "setData", "getData", "Lo00o00o0/OooO0OO;", "Oooo0oO", "Lkotlin/Lazy;", "getAdapter", "()Lo00o00o0/OooO0OO;", "adapter", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentFollowHeadView extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final qd f12058Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Function2<? super List<RecommendNewPostModel>, ? super Integer, Unit> f12060Oooo0oo;

    public static final class OooO00o extends Lambda implements Function0<OooOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f12061Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context) {
            super(0);
            this.f12061Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOO0 invoke() {
            return new OooOO0(this.f12061Oooo0o);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentFollowHeadView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void OooO0O0(MomentFollowHeadView this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function2<? super List<RecommendNewPostModel>, ? super Integer, Unit> function2 = this$0.f12060Oooo0oo;
        if (function2 != null) {
            List<RecommendNewPostModel> data = this$0.getAdapter().getData();
            Intrinsics.checkNotNullExpressionValue(data, "adapter.data");
            function2.invoke(data, Integer.valueOf(i));
        }
    }

    private final p188o00o00o0.OooO0OO<RecommendNewPostModel> getAdapter() {
        return (p188o00o00o0.OooO0OO) this.adapter.getValue();
    }

    public final void OooO0OO() {
        getAdapter().notifyDataSetChanged();
    }

    @NotNull
    public final List<RecommendNewPostModel> getData() {
        List<RecommendNewPostModel> data = getAdapter().getData();
        Intrinsics.checkNotNullExpressionValue(data, "adapter.data");
        return data;
    }

    public final void setData(@Nullable List<RecommendNewPostModel> data) {
        getAdapter().setNewData(data);
        if (data == null || data.isEmpty()) {
            setVisibilityFollowUserHead(8);
        } else {
            setVisibilityFollowUserHead(0);
        }
    }

    public final void setListener(@Nullable Function2<? super List<RecommendNewPostModel>, ? super Integer, Unit> listener) {
        this.f12060Oooo0oo = listener;
    }

    public final void setVisibilityFollowUserHead(int visibility) {
        this.f12058Oooo0o.f50377OooO0OO.setVisibility(visibility);
    }

    public final void setVisibilityReCommentHead(int visibility) {
        this.f12058Oooo0o.f50376OooO0O0.setVisibility(visibility);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentFollowHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentFollowHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        qd qdVarInflate = qd.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(qdVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f12058Oooo0o = qdVarInflate;
        this.adapter = LazyKt.lazy(new OooO00o(context));
        qdVarInflate.f50379OooO0o0.setLayoutManager(new FixLinearLayoutManager(context, 0));
        getAdapter().setOnItemClickListener(new o0OO0O0(this, 0));
        qdVarInflate.f50379OooO0o0.setAdapter(getAdapter());
    }
}
