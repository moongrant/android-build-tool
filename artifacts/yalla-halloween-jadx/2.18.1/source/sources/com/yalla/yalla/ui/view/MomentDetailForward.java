package com.yalla.yalla.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.app.base.adapter.imageView9Grid.ImageView9GridModel;
import com.app.base.util.spannableStringUtils.SpannableStringModel;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentForwardContent;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.ui.view.MomentDetailText;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O0O;
import p168o00Ooo0.o00Oo0;
import p168o00Ooo0.o0O0O00;
import p168o00Ooo0.oo000o;
import p173o00OooO0.o0o0Oo;
import p174o00OooOO.o0oO0Ooo;
import p254o00ooO0O.oOO00O;
import p439o0OoOOo0.o00000O0;
import p535o0o0OOoO.oO0OO00o;
import p601o0oo00Oo.o00OO;
import p601o0oo00Oo.o00OOO00;
import p601o0oo00Oo.oo0O;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.id;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/ui/view/MomentDetailForward;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/MomentDetailModel;", "forwardPostDetailModel", "", "setForwardData", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"NotifyDataSetChanged"})
public final class MomentDetailForward extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final id f24875Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f24876Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public o00Oo0 f24877Oooo0oo;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f24878Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f24879Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            bool.booleanValue();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailForward(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x018a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0191  */
    private final void setForwardData(MomentDetailModel forwardPostDetailModel) {
        MomentSendContentModel content;
        if (forwardPostDetailModel.getForwardContent() != null) {
            MomentForwardContent forwardContent = forwardPostDetailModel.getForwardContent();
            Intrinsics.checkNotNull(forwardContent);
            if (forwardContent.getShareType() == 20) {
                this.f24875Oooo0o.f49660OooO0O0.OooO0O0(forwardPostDetailModel.getForwardContent());
                return;
            }
            MomentDetailShare momentDetailShare = this.f24875Oooo0o.f49664OooO0o0;
            MomentForwardContent forwardContent2 = forwardPostDetailModel.getForwardContent();
            if (forwardContent2 == null) {
                oOO00O.OooO00o(momentDetailShare);
                return;
            }
            oOO00O.OooO(momentDetailShare);
            if (forwardContent2.getImage().length() > 0) {
                momentDetailShare.f24910Oooo0o.f49964OooO0OO.setVisibility(0);
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(momentDetailShare.getContext());
                oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
                oooO00o.OooO0oO(4);
                oooO00o.f48429OooO0OO = forwardContent2.getImage();
                oooO00o.f48427OooO00o = 0;
                oooO00o.OooO0o(momentDetailShare.f24910Oooo0o.f49964OooO0OO);
            }
            if (forwardContent2.getName().length() > 0) {
                momentDetailShare.f24910Oooo0o.f49965OooO0Oo.setVisibility(0);
                momentDetailShare.f24910Oooo0o.f49965OooO0Oo.setText(forwardContent2.getName());
            }
            if (forwardContent2.getContent().length() > 0) {
                momentDetailShare.f24910Oooo0o.f49963OooO0O0.setVisibility(0);
                momentDetailShare.f24910Oooo0o.f49963OooO0O0.setText(forwardContent2.getContent());
                return;
            }
            return;
        }
        if (forwardPostDetailModel.getContent() != null) {
            final MomentDetailText momentDetailText = this.f24875Oooo0o.f49663OooO0o;
            OooO00o oooO00o2 = OooO00o.f24878Oooo0o;
            OooO0O0 oooO0O0 = OooO0O0.f24879Oooo0o;
            momentDetailText.f24915Oooo0oO = null;
            momentDetailText.f24916Oooo0oo = oooO00o2;
            momentDetailText.f24913Oooo = oooO0O0;
            oOO00O.OooO(momentDetailText);
            if (forwardPostDetailModel.getContent() != null) {
                momentDetailText.f24914Oooo0o.f50107OooO0O0.setVisibility(0);
                int iOooO0O0 = oo000o.OooO0O0();
                if (iOooO0O0 == 1) {
                    content = forwardPostDetailModel.getContent();
                    if (content != null) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(": ");
                        sbOooO0o0.append(content.getContent());
                        content.setContent(sbOooO0o0.toString());
                    }
                    o0oO0Ooo o0oo0oooOooO0O0 = o0o0Oo.OooO0O0(momentDetailText.f24915Oooo0oO, content, momentDetailText.f24914Oooo0o.f50107OooO0O0, new oO0OO00o(momentDetailText, 4));
                    oo0O oo0o = new oo0O(momentDetailText, momentDetailText.f24915Oooo0oO);
                    FragmentActivity fragmentActivity = momentDetailText.f24915Oooo0oO;
                    StringBuilder sbOooO00o = o00O0O0O.OooO00o('@');
                    sbOooO00o.append(forwardPostDetailModel.getNickName());
                    oo0o.f32694Oooo0oO = new SpannableStringModel<>(fragmentActivity, sbOooO00o.toString(), R.color.color_00C5B8);
                    o0oo0oooOooO0O0.OooO0O0(oo0o);
                } else if (iOooO0O0 == 2) {
                    MomentSendContentModel content2 = forwardPostDetailModel.getContent();
                    if (content2 != null) {
                        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0(": ");
                        sbOooO0o1.append(content2.getContent());
                        content2.setContent(sbOooO0o1.toString());
                    }
                    o0oO0Ooo o0oo0oooOooO0O1 = o0o0Oo.OooO0O0(momentDetailText.f24915Oooo0oO, content2, momentDetailText.f24914Oooo0o.f50107OooO0O0, new o00OOO00.OooO0O0(momentDetailText, 6));
                    o00OOO00 o00ooo01 = new o00OOO00(momentDetailText, momentDetailText.f24915Oooo0oO);
                    FragmentActivity fragmentActivity2 = momentDetailText.f24915Oooo0oO;
                    StringBuilder sbOooO00o2 = o00O0O0O.OooO00o('@');
                    sbOooO00o2.append(forwardPostDetailModel.getNickName());
                    o00ooo01.f32694Oooo0oO = new SpannableStringModel<>(fragmentActivity2, o0O0O00.OooO0o0(sbOooO00o2.toString()), R.color.color_00C5B8);
                    o0oo0oooOooO0O1.OooO0O0(o00ooo01);
                } else if (iOooO0O0 != 8) {
                    MomentSendContentModel content3 = forwardPostDetailModel.getContent();
                    if (content3 != null) {
                        StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0(": ");
                        sbOooO0o2.append(content3.getContent());
                        content3.setContent(sbOooO0o2.toString());
                    }
                    o0oO0Ooo o0oo0oooOooO0O2 = o0o0Oo.OooO0O0(momentDetailText.f24915Oooo0oO, content3, momentDetailText.f24914Oooo0o.f50107OooO0O0, new o00000O0(momentDetailText, 5));
                    o00OO o00oo2 = new o00OO(momentDetailText, momentDetailText.f24915Oooo0oO);
                    FragmentActivity fragmentActivity3 = momentDetailText.f24915Oooo0oO;
                    StringBuilder sbOooO00o3 = o00O0O0O.OooO00o('@');
                    sbOooO00o3.append(forwardPostDetailModel.getNickName());
                    o00oo2.f32694Oooo0oO = new SpannableStringModel<>(fragmentActivity3, o0O0O00.OooO0o0(sbOooO00o3.toString()), R.color.color_00C5B8);
                    o0oo0oooOooO0O2.OooO0O0(o00oo2);
                } else {
                    content = forwardPostDetailModel.getContent();
                    if (content != null) {
                        StringBuilder sbOooO0o3 = OooO00o.OooO00o.OooO0o0(": ");
                        sbOooO0o3.append(content.getContent());
                        content.setContent(sbOooO0o3.toString());
                    }
                    o0oO0Ooo o0oo0oooOooO0O3 = o0o0Oo.OooO0O0(momentDetailText.f24915Oooo0oO, content, momentDetailText.f24914Oooo0o.f50107OooO0O0, new oO0OO00o(momentDetailText, 4));
                    oo0O oo0o2 = new oo0O(momentDetailText, momentDetailText.f24915Oooo0oO);
                    FragmentActivity fragmentActivity4 = momentDetailText.f24915Oooo0oO;
                    StringBuilder sbOooO00o4 = o00O0O0O.OooO00o('@');
                    sbOooO00o4.append(forwardPostDetailModel.getNickName());
                    oo0o2.f32694Oooo0oO = new SpannableStringModel<>(fragmentActivity4, sbOooO00o4.toString(), R.color.color_00C5B8);
                    o0oo0oooOooO0O3.OooO0O0(oo0o2);
                }
                momentDetailText.f24914Oooo0o.f50107OooO0O0.post(new Runnable() { // from class: o0oo00Oo.o00OO0OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        MomentDetailText.m486setData$lambda2$lambda1(momentDetailText);
                    }
                });
                momentDetailText.f24914Oooo0o.f50107OooO0O0.setMaxLines(6);
            }
        }
        ArrayList<ImageView9GridModel> imageInfoList = forwardPostDetailModel.getImageInfoList();
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNull(imageInfoList);
        Iterator<ImageView9GridModel> it = imageInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getUrl());
        }
        if (this.f24877Oooo0oo == null) {
            this.f24877Oooo0oo = new o00Oo0();
        }
        if (true ^ imageInfoList.isEmpty()) {
            this.f24875Oooo0o.f49661OooO0OO.OooO0o(imageInfoList, this.f24876Oooo0oO);
        }
        if (forwardPostDetailModel.getMomentPoll() != null) {
            this.f24875Oooo0o.f49662OooO0Oo.OooO00o(null, 0L, forwardPostDetailModel.getMomentPoll(), true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailForward(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailForward(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        id idVarInflate = id.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(idVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24875Oooo0o = idVarInflate;
        this.f24876Oooo0oO = -1;
    }
}
