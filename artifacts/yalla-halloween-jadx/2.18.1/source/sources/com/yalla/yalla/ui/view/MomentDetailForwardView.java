package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.adapter.imageView9Grid.ImageView9GridModel;
import com.app.base.util.spannableStringUtils.SpannableStringModel;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentForwardContent;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.model.MomentTypeShareKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import o0O0OOOo.Oooo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O0O;
import p088o000o00.OooOOO0;
import p168o00Ooo0.o00Oo0;
import p168o00Ooo0.o0O0O00;
import p168o00Ooo0.oo000o;
import p173o00OooO0.o0o0Oo;
import p174o00OooOO.o0oO0Ooo;
import p515o0o0O00.o00O00;
import p582o0oOoOoO.u1;
import p601o0oo00Oo.o00O0OO;
import p601o0oo00Oo.o00O0OO0;
import p601o0oo00Oo.oo0o0O0;
import p649o0ooOOoo.jd;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/ui/view/MomentDetailForwardView;", "Landroid/widget/LinearLayout;", "Lcom/yalla/yalla/model/MomentDetailModel;", "postModel", "", "setForwardShareView", "forwardModel", "setForwardData", "postDetailModelForward0", "setForwardText", "setForwardImage", "Lcom/yalla/yalla/model/MomentForwardContent;", "forwardContent", "setForwardEvent", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentDetailForwardView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final /* synthetic */ int f24880Oooo = 0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final jd f24881Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f24882Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public o00Oo0 f24883Oooo0oo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailForwardView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setForwardData(MomentDetailModel forwardModel) {
        if (forwardModel != null) {
            this.f24881Oooo0o.f49756OooO0OO.setVisibility(0);
            if (forwardModel.getForwardContent() != null) {
                MomentForwardContent forwardContent = forwardModel.getForwardContent();
                Intrinsics.checkNotNull(forwardContent);
                if (!MomentTypeShareKt.isSupportMomentTypeShare(forwardContent.getShareType())) {
                    this.f24881Oooo0o.f49761OooO0oo.setVisibility(0);
                    return;
                }
            }
            setForwardText(forwardModel);
            if (forwardModel.getType() == MomentType.Poll.getValue()) {
                if (forwardModel.getMomentPoll() == null) {
                    return;
                }
                MomentDetailPollView momentDetailPollView = this.f24881Oooo0o.f49760OooO0oO;
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                Intrinsics.throwUninitializedPropertyAccessException("itemData");
                throw null;
            }
            if (forwardModel.getType() != MomentType.Event.getValue()) {
                setForwardShareView(forwardModel);
                setForwardImage(forwardModel);
            } else if (forwardModel.getForwardContent() != null) {
                MomentDetailEventView momentDetailEventView = this.f24881Oooo0o.f49758OooO0o;
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                momentDetailEventView.OooO0O0(forwardModel.getForwardContent());
            }
        }
    }

    private final void setForwardEvent(MomentForwardContent forwardContent) {
    }

    private final void setForwardImage(MomentDetailModel postDetailModelForward0) {
        ArrayList<ImageView9GridModel> imageInfoList = postDetailModelForward0.getImageInfoList();
        ArrayList arrayList = new ArrayList();
        Iterator<ImageView9GridModel> it = imageInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getUrl());
        }
        if (this.f24883Oooo0oo == null) {
            this.f24883Oooo0oo = new o00Oo0();
        }
        if (!imageInfoList.isEmpty()) {
            this.f24881Oooo0o.f49755OooO0O0.OooO0o(imageInfoList, this.f24882Oooo0oO);
        }
    }

    private final void setForwardShareView(MomentDetailModel postModel) {
        MomentForwardContent forwardContent = postModel.getForwardContent();
        if (forwardContent != null) {
            if (!MomentTypeShareKt.isSupportMomentTypeShare(forwardContent.getShareType())) {
                this.f24881Oooo0o.f49761OooO0oo.setVisibility(0);
                return;
            }
            MomentDetailShareView momentDetailShareView = this.f24881Oooo0o.f49759OooO0o0;
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            momentDetailShareView.OooO00o(null, postModel);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0132  */
    private final void setForwardText(MomentDetailModel postDetailModelForward0) {
        MomentSendContentModel content;
        o00O00.OooO0O0("setForwardText postDetailModelForward0 = " + postDetailModelForward0);
        if (postDetailModelForward0.getContent() != null) {
            int type = postDetailModelForward0.getType();
            int i = 1;
            if ((((type == MomentType.Text.getValue() || type == MomentType.Image.getValue()) || type == MomentType.Share.getValue()) || type == MomentType.Event.getValue()) || type == MomentType.Poll.getValue()) {
                this.f24881Oooo0o.f49753OooO.setVisibility(0);
                this.f24881Oooo0o.f49757OooO0Oo.setVisibility(0);
            }
            int iOooO0O0 = oo000o.OooO0O0();
            if (iOooO0O0 == 1) {
                content = postDetailModelForward0.getContent();
                if (content != null) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(": ");
                    sbOooO0o0.append(content.getContent());
                    content.setContent(sbOooO0o0.toString());
                }
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                o0oO0Ooo o0oo0oooOooO0O0 = o0o0Oo.OooO0O0(null, content, this.f24881Oooo0o.f49753OooO, new Oooo0(this));
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                o00O0OO0 o00o0oo1 = new o00O0OO0(this);
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                StringBuilder sbOooO00o = o00O0O0O.OooO00o('@');
                sbOooO00o.append(postDetailModelForward0.getNickName());
                o00o0oo1.f32694Oooo0oO = new SpannableStringModel<>(null, sbOooO00o.toString(), R.color.color_00C5B8);
                o0oo0oooOooO0O0.OooO0O0(o00o0oo1);
            } else if (iOooO0O0 == 2) {
                MomentSendContentModel content2 = postDetailModelForward0.getContent();
                if (content2 != null) {
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0(": ");
                    sbOooO0o1.append(content2.getContent());
                    content2.setContent(sbOooO0o1.toString());
                }
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                o0oO0Ooo o0oo0oooOooO0O1 = o0o0Oo.OooO0O0(null, content2, this.f24881Oooo0o.f49753OooO, new u1(this));
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                o00O0OO o00o0oo2 = new o00O0OO(this);
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                StringBuilder sbOooO00o2 = o00O0O0O.OooO00o('@');
                sbOooO00o2.append(postDetailModelForward0.getNickName());
                o00o0oo2.f32694Oooo0oO = new SpannableStringModel<>(null, o0O0O00.OooO0o0(sbOooO00o2.toString()), R.color.color_00C5B8);
                o0oo0oooOooO0O1.OooO0O0(o00o0oo2);
            } else if (iOooO0O0 != 8) {
                MomentSendContentModel content3 = postDetailModelForward0.getContent();
                if (content3 != null) {
                    StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0(": ");
                    sbOooO0o2.append(content3.getContent());
                    content3.setContent(sbOooO0o2.toString());
                }
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                o0oO0Ooo o0oo0oooOooO0O2 = o0o0Oo.OooO0O0(null, content3, this.f24881Oooo0o.f49753OooO, new p538o0o0Oo0.o0o0Oo(this, 3));
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                oo0o0O0 oo0o0o0 = new oo0o0O0(this);
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                StringBuilder sbOooO00o3 = o00O0O0O.OooO00o('@');
                sbOooO00o3.append(postDetailModelForward0.getNickName());
                oo0o0o0.f32694Oooo0oO = new SpannableStringModel<>(null, o0O0O00.OooO0o0(sbOooO00o3.toString()), R.color.color_00C5B8);
                o0oo0oooOooO0O2.OooO0O0(oo0o0o0);
            } else {
                content = postDetailModelForward0.getContent();
                if (content != null) {
                    StringBuilder sbOooO0o3 = OooO00o.OooO00o.OooO0o0(": ");
                    sbOooO0o3.append(content.getContent());
                    content.setContent(sbOooO0o3.toString());
                }
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                o0oO0Ooo o0oo0oooOooO0O3 = o0o0Oo.OooO0O0(null, content, this.f24881Oooo0o.f49753OooO, new Oooo0(this));
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                o00O0OO0 o00o0oo3 = new o00O0OO0(this);
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                StringBuilder sbOooO00o4 = o00O0O0O.OooO00o('@');
                sbOooO00o4.append(postDetailModelForward0.getNickName());
                o00o0oo3.f32694Oooo0oO = new SpannableStringModel<>(null, sbOooO00o4.toString(), R.color.color_00C5B8);
                o0oo0oooOooO0O3.OooO0O0(o00o0oo3);
            }
            this.f24881Oooo0o.f49753OooO.post(new OooOOO0(this, i));
            this.f24881Oooo0o.f49753OooO.setMaxLines(6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setForwardText$lambda-2, reason: not valid java name */
    public static final void m485setForwardText$lambda2(MomentDetailForwardView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.f24881Oooo0o.f49753OooO.getLayout() == null || this$0.f24881Oooo0o.f49753OooO.getLayout().getLineCount() <= 6) {
                return;
            }
            this$0.f24881Oooo0o.f49762OooOO0.setVisibility(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailForwardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailForwardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        jd jdVarInflate = jd.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(jdVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24881Oooo0o = jdVarInflate;
        this.f24882Oooo0oO = -1;
    }
}
