package p496o0o00Oo0;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.session.Oooo0;
import com.code.android.util.o0000;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O0o;
import p318o0O0oOoo.o00O0OO0;
import p384o0OOoo0O.o00Ooo;
import p384o0OOoo0O.o0OO00O;
import p423o0OoO0OO.o00O0O0O;
import p426o0OoO0o0.OooOOOO;
import p475o0Ooooo0.o0O00oO0;
import p492o0o00OO0.o00O0O0;
import p562o0oOo000.o000000;
import p599o0oo00o.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class l {

    public static final class OooO00o extends Lambda implements Function2<Integer, MoreModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f49652OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailCommentFragment f49653OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f49654OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f49655OooO0oO;

        /* JADX INFO: renamed from: o0o00Oo0.l$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0464OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MoreTag.values().length];
                try {
                    iArr[MoreTag.copy.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MoreTag.delete.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MoreTag.hide.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MoreTag.report.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MoreTag.reply.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FragmentActivity fragmentActivity, MomentCommentDetailModel momentCommentDetailModel, MomentDetailCommentFragment momentDetailCommentFragment, long j) {
            super(2);
            this.f49652OooO0Oo = fragmentActivity;
            this.f49654OooO0o0 = momentCommentDetailModel;
            this.f49653OooO0o = momentDetailCommentFragment;
            this.f49655OooO0oO = j;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, MoreModel moreModel) {
            num.intValue();
            MoreModel moreModel2 = moreModel;
            if (moreModel2 == null) {
                return null;
            }
            int i = C0464OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()];
            MomentCommentDetailModel momentCommentDetailModel = this.f49654OooO0o0;
            if (i != 1) {
                MomentDetailCommentFragment momentDetailCommentFragment = this.f49653OooO0o;
                if (i == 2) {
                    long id = momentCommentDetailModel.getId();
                    StringBuilder sb = new StringBuilder();
                    sb.append(id);
                    momentDetailCommentFragment.deleteComment(sb.toString());
                } else if (i == 3) {
                    momentDetailCommentFragment.hideComment(this.f49655OooO0oO, momentCommentDetailModel.getId());
                } else if (i == 4) {
                    long id2 = momentCommentDetailModel.getId();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(id2);
                    momentDetailCommentFragment.reportComment(sb2.toString());
                } else if (i == 5) {
                    momentDetailCommentFragment.toReplyComment(momentCommentDetailModel);
                }
            } else {
                FragmentActivity fragmentActivity = this.f49652OooO0Oo;
                TextView textView = new TextView(fragmentActivity);
                o00O0O.OooO0OO(fragmentActivity, momentCommentDetailModel.getContent(), textView, new o00O0OO0(momentCommentDetailModel));
                Intrinsics.checkNotNull(fragmentActivity);
                o00O0O0O.OooO0o0(textView, fragmentActivity, o0000.OooO0OO(o000000.Copied));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f49656OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Integer, MoreModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentReplyActivity f49657OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f49658OooO0o0;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MoreTag.values().length];
                try {
                    iArr[MoreTag.copy.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MoreTag.delete.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MoreTag.dislike.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MoreTag.report.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MoreTag.reply.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentCommentDetailModel momentCommentDetailModel, MomentReplyActivity momentReplyActivity) {
            super(2);
            this.f49657OooO0Oo = momentReplyActivity;
            this.f49658OooO0o0 = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, MoreModel moreModel) {
            num.intValue();
            MoreModel moreModel2 = moreModel;
            if (moreModel2 == null) {
                return null;
            }
            int i = OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()];
            MomentReplyActivity momentReplyActivity = this.f49657OooO0Oo;
            MomentCommentDetailModel momentCommentDetailModel = this.f49658OooO0o0;
            if (i == 1) {
                TextView textView = new TextView(momentReplyActivity);
                o00O0O.OooO0OO(momentReplyActivity, momentCommentDetailModel.getContent(), textView, new Oooo0(momentCommentDetailModel));
                o00O0O0O.OooO0o0(textView, momentReplyActivity, o0000.OooO0OO(o000000.Copied));
            } else if (i == 2) {
                long id = momentCommentDetailModel.getId();
                StringBuilder sb = new StringBuilder();
                sb.append(id);
                String string = sb.toString();
                momentReplyActivity.getClass();
                o00Ooo o00ooo2 = o0OO00O.f43463OooO0O0;
                String momentId = momentReplyActivity.OooOoo0().getMomentId();
                o00O0O0 o00o0o0 = new o00O0O0(true, momentReplyActivity);
                o00ooo2.getClass();
                LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
                linkedHashMapOooO00o.put("dyid", momentId);
                linkedHashMapOooO00o.put("cid", string);
                com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43408o0000O0O, p384o0OOoo0O.Oooo0.f43405o0000O, linkedHashMapOooO00o, o00o0o0);
            } else if (i == 3) {
                MomentDetailModel currentMomentDetail = momentReplyActivity.OooOoO().getCurrentMomentDetail();
                if (currentMomentDetail != null) {
                    LiveEventBus.get("DISLIKE_COMMENT").post(new Pair(Long.valueOf(currentMomentDetail.getId()), Long.valueOf(momentCommentDetailModel.getId())));
                    momentReplyActivity.finish();
                }
            } else if (i == 4) {
                long id2 = momentCommentDetailModel.getId();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(id2);
                momentReplyActivity.OooOooo(sb2.toString());
            } else if (i == 5) {
                momentReplyActivity.OooOooO(500L);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f49659OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static void OooO00o(@Nullable MomentCommentDetailModel momentCommentDetailModel, long j, @Nullable MomentDetailCommentFragment momentDetailCommentFragment) {
        FragmentActivity activity;
        if (momentDetailCommentFragment == null || (activity = momentDetailCommentFragment.getActivity()) == null || momentCommentDetailModel == null || momentCommentDetailModel.getId() < 1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            MoreTag moreTag = MoreTag.reply;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag.getText()), moreTag));
            MoreTag moreTag2 = MoreTag.copy;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag2.getText()), moreTag2));
        }
        if (momentCommentDetailModel.getIsDel()) {
            MoreTag moreTag3 = MoreTag.delete;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag3.getText()), moreTag3));
        } else {
            MoreTag moreTag4 = MoreTag.hide;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag4.getText()), moreTag4));
            MoreTag moreTag5 = MoreTag.report;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag5.getText()), moreTag5));
        }
        o000O0o o000o0o2 = new o000O0o(activity, null);
        o000o0o2.OooOOO(arrayList);
        o000o0o2.OooOOo0(new OooO00o(activity, momentCommentDetailModel, momentDetailCommentFragment, j));
        o000o0o2.OooO(OooO0O0.f49656OooO0Oo);
        o000o0o2.OooOO0o();
    }

    public static void OooO0O0(@Nullable MomentCommentDetailModel momentCommentDetailModel, @Nullable MomentReplyActivity momentReplyActivity) {
        if (momentReplyActivity == null || momentCommentDetailModel == null || momentCommentDetailModel.getId() < 1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            MoreTag moreTag = MoreTag.reply;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag.getText()), moreTag));
            MoreTag moreTag2 = MoreTag.copy;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag2.getText()), moreTag2));
        }
        if (momentCommentDetailModel.getIsDel()) {
            MoreTag moreTag3 = MoreTag.delete;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag3.getText()), moreTag3));
        } else {
            MoreTag moreTag4 = MoreTag.dislike;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag4.getText()), moreTag4));
            MoreTag moreTag5 = MoreTag.report;
            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag5.getText()), moreTag5));
        }
        o000O0o o000o0o2 = new o000O0o(momentReplyActivity, null);
        o000o0o2.OooOOO(arrayList);
        o000o0o2.OooOOo0(new OooO0OO(momentCommentDetailModel, momentReplyActivity));
        o000o0o2.OooO(OooO0o.f49659OooO0Oo);
        o000o0o2.OooOO0o();
    }
}
