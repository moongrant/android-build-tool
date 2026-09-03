package p539o0o0Oo00;

import android.app.Activity;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.code.android.util.OooO0OO;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.table.HideContent;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentEditBefore;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.activity.moment.MomentEditRecordScreen;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p205o00o0o0o.o000O0o;
import p386o0OOoo0O.o0OoOo0;
import p410o0Oo0Oo0.o00O0O;
import p425o0OoO0OO.oOO00O;
import p474o0OoooOO.oo0oO0;
import p532o0o0OOOO.o0O0o000;
import p565o0oOo000.o000OOo;
import p593o0oOoooO.h0;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class Oooo000 {

    public static final class OooO00o extends Lambda implements Function2<Integer, MoreModel, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Long f54407OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54408OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Activity f54409OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f54410OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ BaseMomentDetailVM f54411OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f54412OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f54413OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Long f54414OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f54415OooOO0o;

        /* JADX INFO: renamed from: o0o0Oo00.Oooo000$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0484OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MoreTag.values().length];
                try {
                    iArr[MoreTag.dislike.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MoreTag.report.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MoreTag.copy.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MoreTag.deletePost.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MoreTag.reply.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[MoreTag.postRemoveOutOfTopic.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[MoreTag.postTopOfTopic.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[MoreTag.postUnTopOfTopic.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[MoreTag.postTopOfUser.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[MoreTag.postUnTopOfUser.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[MoreTag.DisableTheUser.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[MoreTag.postEdit.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[MoreTag.postEditHistory.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(MomentDetailModel momentDetailModel, String str, Activity activity, BaseMomentDetailVM baseMomentDetailVM, boolean z, Long l, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, Long l2, MomentAdapterTag momentAdapterTag) {
            super(2);
            this.f54408OooO0Oo = momentDetailModel;
            this.f54410OooO0o0 = str;
            this.f54409OooO0o = activity;
            this.f54411OooO0oO = baseMomentDetailVM;
            this.f54412OooO0oo = z;
            this.f54407OooO = l;
            this.f54413OooOO0 = function2;
            this.f54414OooOO0O = l2;
            this.f54415OooOO0o = momentAdapterTag;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, MoreModel moreModel) {
            num.intValue();
            MoreModel moreModel2 = moreModel;
            if (moreModel2 != null) {
                MomentDetailModel momentDetailModel = this.f54408OooO0Oo;
                BaseMomentDetailVM baseMomentDetailVM = this.f54411OooO0oO;
                boolean z = this.f54412OooO0oo;
                Long l = this.f54407OooO;
                Long l2 = this.f54414OooOO0O;
                int i = C0484OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()];
                boolean z2 = false;
                Activity activity = this.f54409OooO0o;
                switch (i) {
                    case 1:
                        long id = momentDetailModel != null ? momentDetailModel.getId() : 0L;
                        HideContent hideContent = new HideContent();
                        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                        hideContent.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
                        hideContent.setType(0);
                        hideContent.setContentId(String.valueOf(id));
                        o00O0O.OooO00o().OooOo0o().OooO00o(hideContent);
                        o000O00.OooO00o(o000OOo.thanks_feedback);
                        LiveEventBus.get("MOMENT_HIDE_POST").post(Long.valueOf(id));
                        break;
                    case 2:
                        o0O0o000.OooO0o0(ReportScreen.INSTANCE, ReportScreen.bundleOf(4, momentDetailModel != null ? momentDetailModel.getId() : 0L, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
                        break;
                    case 3:
                        oOO00O.OooO00o(activity, this.f54410OooO0o0, o0000.OooO0OO(o000OOo.Copied));
                        break;
                    case 4:
                        o000O o000o = new o000O(activity);
                        o000o.OooOo00(o0000.OooO0OO(o000OOo.art_you_sure));
                        o000o.OooOo(true);
                        o000o.OooOo0(new OooOO0O(activity, momentDetailModel, baseMomentDetailVM, l, z));
                        o000o.OooOO0o();
                        break;
                    case 5:
                        Function2<PostDetailHeaderViewTag, Object, Unit> function2 = this.f54413OooOO0;
                        if (function2 != null) {
                            function2.invoke(PostDetailHeaderViewTag.PostDetailReply, null);
                        }
                        break;
                    case 6:
                        h0.OooO0O0("103039");
                        o000O o000o2 = new o000O(activity);
                        o000o2.OooOo00(o0000.OooO0OO(o000OOo.RemovePost_ForTopic));
                        o000o2.OooOo(true);
                        o000o2.OooOo0(new o00O0O(activity, momentDetailModel, baseMomentDetailVM, l));
                        o000o2.OooOO0o();
                        break;
                    case 7:
                        h0.OooO0O0("103038");
                        String strOooO0OO = o0000.OooO0OO(o000OOo.OnTopPost_ForTopic);
                        if ((l2 != null ? l2.longValue() : 0L) > 0) {
                            strOooO0OO = o0000.OooO0OO(o000OOo.OnTopPost_ForTopic_OnlyOne);
                        }
                        o000O o000o3 = new o000O(activity);
                        o000o3.OooOo00(strOooO0OO);
                        o000o3.OooOo(true);
                        o000o3.OooOo0(new Oooo0(activity, momentDetailModel, baseMomentDetailVM, l2, l));
                        o000o3.OooOO0o();
                        break;
                    case 8:
                        o000O o000o4 = new o000O(activity);
                        o000o4.OooOo00(o0000.OooO0OO(o000OOo.OnTopPost_ForTopic_Cancel));
                        o000o4.OooOo(true);
                        o000o4.OooOo0(new o0OoOo0(activity, momentDetailModel, baseMomentDetailVM, l2, l));
                        o000o4.OooOO0o();
                        break;
                    case 9:
                        h0.OooO0O0("105076");
                        if ((l2 != null ? l2.longValue() : 0L) <= 0) {
                            Oooo000.OooO0O0(activity, momentDetailModel, baseMomentDetailVM, l2);
                        } else {
                            String strOooO0OO2 = o0000.OooO0OO(o000OOo.user_top_dialog_replace_it);
                            o000O o000o5 = new o000O(activity);
                            o000o5.OooOo00(strOooO0OO2);
                            o000o5.OooOo(true);
                            o000o5.OooOo0(new o000oOoO(activity, momentDetailModel, baseMomentDetailVM));
                            o000o5.OooOO0o();
                        }
                        break;
                    case 10:
                        h0.OooO0O0("105077");
                        Oooo000.OooO0O0(activity, momentDetailModel, baseMomentDetailVM, l2);
                        break;
                    case 11:
                        String strOooO0OO3 = o0000.OooO0OO(o000OOo.OnTopPost_ForTopic_DisableTheUser);
                        String[] strArr = new String[1];
                        strArr[0] = momentDetailModel != null ? momentDetailModel.getNickName() : null;
                        String strOooO00o = o0000O.OooO00o(strOooO0OO3, strArr);
                        String[] strArr2 = new String[1];
                        strArr2[0] = momentDetailModel != null ? momentDetailModel.getNickName() : null;
                        String strOooO00o2 = o0000O.OooO00o(strOooO00o, strArr2);
                        o000O o000o6 = new o000O(activity);
                        o000o6.OooOo00(strOooO00o2);
                        o000o6.OooOo(true);
                        o000o6.OooOo0(new o00Oo0(activity, momentDetailModel, baseMomentDetailVM, l));
                        o000o6.OooOO0o();
                        break;
                    case 12:
                        h0.OooO0O0("103008");
                        oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                        Pair pair = (Pair) oo0oO0.OooOO0o().getValue();
                        if (pair != null && !((Boolean) pair.getFirst()).booleanValue()) {
                            z2 = true;
                        }
                        if (!z2) {
                            Pair pair2 = (Pair) oo0oO0.OooOO0o().getValue();
                            if ((pair2 != null ? ((Number) pair2.getSecond()).intValue() : PremiumLevel.Premium0.getValue()) <= PremiumLevel.Premium0.getValue()) {
                                o000O o000o7 = new o000O(activity);
                                o000o7.OooOo00(o0000.OooO0OO(o000OOo.Moment_Detail_Edit_Only_Premium));
                                o000o7.OooOOOO(o000OOo.Get_Yalla_Premium);
                                o000o7.OooOo0(new OooOOO0(activity));
                                o000o7.OooOo(true);
                                o000o7.OooOO0o();
                            } else if (momentDetailModel != null) {
                                LiveData<ApiResult<MomentEditBefore>> liveDataMomentEditBefore = baseMomentDetailVM.momentEditBefore(momentDetailModel.getId());
                                Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                                liveDataMomentEditBefore.observe((LifecycleOwner) activity, new o0OoOo0(new OooOOO(activity, momentDetailModel, this.f54415OooOO0o), null, null, false, 14));
                            }
                        } else {
                            o000O o000o8 = new o000O(activity);
                            o000o8.OooOo00(o0000.OooO0OO(o000OOo.Moment_Detail_Edit_Only_Premium));
                            o000o8.OooOOOO(o000OOo.Get_Yalla_Premium);
                            o000o8.OooOo0(new OooOOO0(activity));
                            o000o8.OooOo(true);
                            o000o8.OooOO0o();
                        }
                        break;
                    case 13:
                        h0.OooO0O0("103009");
                        if (momentDetailModel != null) {
                            MomentEditRecordScreen.INSTANCE.navigate(momentDetailModel.getId());
                        }
                        break;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1043)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:997)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO00o(Activity activity, MomentDetailModel momentDetailModel, BaseMomentDetailVM baseMomentDetailVM, Long l, Long l2) {
        if (l2 != null) {
            l2.longValue();
            int i = Intrinsics.areEqual(l, momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null) ? 2 : 1;
            LiveData<ApiResult<Object>> liveDataCircleDiscoveryTopIns = baseMomentDetailVM.circleDiscoveryTopIns(l2.longValue(), momentDetailModel != null ? momentDetailModel.getId() : 0L, i);
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            liveDataCircleDiscoveryTopIns.observe((LifecycleOwner) activity, new o0OoOo0(new OooOo00(i, l2, momentDetailModel), null, null, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0O0(Activity activity, MomentDetailModel momentDetailModel, BaseMomentDetailVM baseMomentDetailVM, Long l) {
        OooOOOO.OooO0OO("ddaada", "topPostId = " + l + ", itemData = " + (momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null));
        int i = (l != null ? l.longValue() : 0L) > 0 ? 2 : 1;
        LiveData<ApiResult<Object>> liveData = baseMomentDetailVM.topInsForUserPost(momentDetailModel != null ? momentDetailModel.getId() : 0L, i);
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        liveData.observe((LifecycleOwner) activity, new o0OoOo0(new OooOo(i, activity, momentDetailModel), null, null, false));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:59:0x0101  */
    public static void OooO0OO(@Nullable String str, @Nullable MomentDetailModel momentDetailModel, boolean z, @Nullable MomentAdapterTag momentAdapterTag, @Nullable Activity activity, @Nullable Long l, boolean z2, @Nullable String str2, @Nullable ArrayList arrayList, @NotNull BaseMomentDetailVM momentVm, @Nullable Long l2, boolean z3, @Nullable Function2 function2) {
        boolean z4;
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(momentVm, "momentVm");
        if (OooO0OO.OooO00o(activity)) {
            ArrayList arrayList2 = new ArrayList();
            Long lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getUserId()) : null;
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            if (!Intrinsics.areEqual(lValueOf, oo0oO0.OooOOo0().getValue()) && (momentAdapterTag == MomentAdapterTag.MomentListFollowingFragment || momentAdapterTag == MomentAdapterTag.MomentListFollowingFragment_Recommend || momentAdapterTag == MomentAdapterTag.MomentListFeaturedFragment || momentAdapterTag == MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag == MomentAdapterTag.TopicDetailFragmentLatest || momentAdapterTag == MomentAdapterTag.RoomInfoMomentsFragment)) {
                MoreTag moreTag = MoreTag.dislike;
                arrayList2.add(new MoreModel(o0000.OooO0OO(moreTag.getText()), moreTag));
            }
            if (TextUtils.isEmpty(str)) {
                if (z2) {
                    MoreTag moreTag2 = MoreTag.reply;
                    arrayList2.add(new MoreModel(o0000.OooO0OO(moreTag2.getText()), moreTag2));
                }
                if (momentDetailModel != null && momentDetailModel.getIsCanDel()) {
                    if (momentDetailModel == null && momentDetailModel.getType() == MomentType.Poll.getValue()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        if (momentDetailModel == null && momentDetailModel.getType() == MomentType.YallaTeam.getValue()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5) {
                            if (momentDetailModel == null && momentDetailModel.getType() == MomentType.YallaChatGroup.getValue()) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (!z6 && !z3) {
                                MoreTag moreTag3 = MoreTag.postEdit;
                                arrayList2.add(new MoreModel(o0000.OooO0OO(moreTag3.getText()), moreTag3));
                            }
                        }
                    }
                    MoreTag moreTag4 = MoreTag.deletePost;
                    arrayList2.add(new MoreModel(o0000.OooO0OO(moreTag4.getText()), moreTag4));
                } else {
                    if (Intrinsics.areEqual(momentDetailModel != null ? Long.valueOf(momentDetailModel.getUserId()) : null, oo0oO0.OooOOo0().getValue())) {
                        if (momentDetailModel == null) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            if (momentDetailModel == null) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (!z5) {
                                if (momentDetailModel == null) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                if (!z6) {
                                    MoreTag moreTag5 = MoreTag.postEdit;
                                    arrayList2.add(new MoreModel(o0000.OooO0OO(moreTag5.getText()), moreTag5));
                                }
                            }
                        }
                        MoreTag moreTag6 = MoreTag.deletePost;
                        arrayList2.add(new MoreModel(o0000.OooO0OO(moreTag6.getText()), moreTag6));
                    } else {
                        MoreTag moreTag7 = MoreTag.report;
                        arrayList2.add(new MoreModel(o0000.OooO0OO(moreTag7.getText()), moreTag7));
                    }
                }
                if (!z && (momentAdapterTag == MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag == MomentAdapterTag.TopicDetailFragmentLatest)) {
                    boolean zOooO00o = p495o0o00OOO.Oooo000.OooO00o(str2);
                    boolean zContains = arrayList != null ? arrayList.contains(String.valueOf(oo0oO0.OooOOo0().getValue())) : false;
                    boolean z7 = momentDetailModel != null && momentDetailModel.getPositionid() == 3;
                    boolean z8 = momentDetailModel != null && momentDetailModel.getPositionid() == 1;
                    if (zOooO00o) {
                        if (!z8) {
                            MoreTag moreTag8 = MoreTag.postRemoveOutOfTopic;
                            arrayList2.add(new MoreModel(o0000.OooO0OO(moreTag8.getText()), moreTag8));
                        }
                        if (Intrinsics.areEqual(l, momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null)) {
                            MoreTag moreTag9 = MoreTag.postUnTopOfTopic;
                            arrayList2.add(new MoreModel(o0000.OooO0OO(moreTag9.getText()), moreTag9));
                        } else {
                            MoreTag moreTag10 = MoreTag.postTopOfTopic;
                            arrayList2.add(new MoreModel(o0000.OooO0OO(moreTag10.getText()), moreTag10));
                        }
                        if (!z8) {
                            if ((momentDetailModel == null || momentDetailModel.getIsblack()) ? false : true) {
                                MoreTag moreTag11 = MoreTag.DisableTheUser;
                                arrayList2.add(new MoreModel(o0000.OooO0OO(moreTag11.getText()), moreTag11));
                            }
                        }
                    }
                    if (zContains) {
                        if (!z8 && !z7) {
                            MoreTag moreTag12 = MoreTag.postRemoveOutOfTopic;
                            arrayList2.add(new MoreModel(o0000.OooO0OO(moreTag12.getText()), moreTag12));
                        }
                        if (!z8 && !z7) {
                            if ((momentDetailModel == null || momentDetailModel.getIsblack()) ? false : true) {
                                MoreTag moreTag13 = MoreTag.DisableTheUser;
                                arrayList2.add(new MoreModel(o0000.OooO0OO(moreTag13.getText()), moreTag13));
                            }
                        }
                    }
                }
                if (!z && momentAdapterTag == MomentAdapterTag.UserPostListActivity) {
                    if (Intrinsics.areEqual(momentDetailModel != null ? Long.valueOf(momentDetailModel.getUserId()) : null, oo0oO0.OooOOo0().getValue()) && !z3) {
                        if (Intrinsics.areEqual(l, momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null)) {
                            MoreTag moreTag14 = MoreTag.postUnTopOfUser;
                            arrayList2.add(0, new MoreModel(o0000.OooO0OO(moreTag14.getText()), moreTag14));
                        } else {
                            MoreTag moreTag15 = MoreTag.postTopOfUser;
                            arrayList2.add(0, new MoreModel(o0000.OooO0OO(moreTag15.getText()), moreTag15));
                        }
                    }
                }
                if ((momentDetailModel != null && momentDetailModel.getIsEdited()) && !z3) {
                    MoreTag moreTag16 = MoreTag.postEditHistory;
                    arrayList2.add(new MoreModel(o0000.OooO0OO(moreTag16.getText()), moreTag16));
                }
            } else {
                MoreTag moreTag17 = MoreTag.copy;
                arrayList2.add(new MoreModel(o0000.OooO0OO(moreTag17.getText()), moreTag17));
            }
            Intrinsics.checkNotNull(activity);
            o000O0o o000o0o2 = new o000O0o(activity, null);
            o000o0o2.OooOOO(arrayList2);
            o000o0o2.OooOOo0(new OooO00o(momentDetailModel, str, activity, momentVm, z, l2, function2, l, momentAdapterTag));
            o000o0o2.OooOO0o();
        }
    }
}
