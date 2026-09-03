package p511o0o0O;

import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.WealthLevel;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.gift.GiftPropTypeTips;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.fragment.GiftSendFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftSendFragment f51069OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51070OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(o00000OO o00000oo2, GiftSendFragment giftSendFragment) {
        super(1);
        this.f51069OooO0Oo = giftSendFragment;
        this.f51070OooO0o0 = o00000oo2;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        int pageTypeUser = this.f51069OooO0Oo.getPageTypeUser();
        int value = GiftPropTypeUser.Wealth.getValue();
        o00000OO o00000oo2 = this.f51070OooO0o0;
        if (pageTypeUser == value) {
            GiftPropModel giftPropModel = o00000oo2.f50968OooOOo;
            if (o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(GiftPropModel.isMerge$default(giftPropModel, null, 1, null)) : null)) {
                o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.GiftMerge);
            } else {
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (o0OoOo0.OooO0o0(0, (Integer) o0O00oO0.OooO0oO().getValue()) >= WealthLevel.Wealth1.getValue() || !zBooleanValue) {
                    o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.Default);
                } else {
                    o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.GiftTypeNotUp);
                }
            }
        } else if (pageTypeUser == GiftPropTypeUser.Flags.getValue()) {
            GiftPropModel giftPropModel2 = o00000oo2.f50968OooOOo;
            if (o0OoOo0.OooO00o(giftPropModel2 != null ? Boolean.valueOf(GiftPropModel.isMerge$default(giftPropModel2, null, 1, null)) : null)) {
                o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.GiftMerge);
            } else if (o00000oo2.f50958OooO == GiftPropTypeShow.InRoom && zBooleanValue) {
                o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.GiftTypeNotUp);
            } else {
                o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.Default);
            }
        } else if (pageTypeUser == GiftPropTypeUser.Member.getValue()) {
            GiftPropModel giftPropModel3 = o00000oo2.f50968OooOOo;
            if (o0OoOo0.OooO00o(giftPropModel3 != null ? Boolean.valueOf(GiftPropModel.isMerge$default(giftPropModel3, null, 1, null)) : null)) {
                o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.GiftMerge);
            } else if (OooO0O0.f24533OoooOOO.OooO00o().OooOO0O() || !zBooleanValue) {
                o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.Default);
            } else {
                o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.GiftTypeNotUp);
            }
        } else if (pageTypeUser == GiftPropTypeUser.Premium.getValue()) {
            GiftPropModel giftPropModel4 = o00000oo2.f50968OooOOo;
            if (o0OoOo0.OooO00o(giftPropModel4 != null ? Boolean.valueOf(GiftPropModel.isMerge$default(giftPropModel4, null, 1, null)) : null)) {
                o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.GiftMerge);
            } else {
                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                Pair pair = (Pair) o0O00oO0.OooOO0o().getValue();
                if (o0OoOo0.OooO00o(pair != null ? (Boolean) pair.getFirst() : null)) {
                    PremiumLevel.Companion companion = PremiumLevel.INSTANCE;
                    Pair pair2 = (Pair) o0O00oO0.OooOO0o().getValue();
                    if (companion.of(pair2 != null ? (Integer) pair2.getSecond() : null).getValue() > 0) {
                        o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.Default);
                    } else if (zBooleanValue) {
                        o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.GiftTypeNotUp);
                    } else {
                        o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.Default);
                    }
                } else if (zBooleanValue) {
                    o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.GiftTypeNotUp);
                } else {
                    o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.Default);
                }
            }
        } else if (pageTypeUser == GiftPropTypeUser.Vip.getValue()) {
            GiftPropModel giftPropModel5 = o00000oo2.f50968OooOOo;
            if (o0OoOo0.OooO00o(giftPropModel5 != null ? Boolean.valueOf(GiftPropModel.isMerge$default(giftPropModel5, null, 1, null)) : null)) {
                o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.GiftMerge);
            } else {
                o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                Pair pair3 = (Pair) o0O00oO0.OooOO0().getValue();
                if (o0OoOo0.OooO0o0(0, pair3 != null ? (Integer) pair3.getSecond() : null) > 0 || !zBooleanValue) {
                    o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.Default);
                } else {
                    o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.GiftTypeNotUp);
                }
            }
        } else {
            GiftPropModel giftPropModel6 = o00000oo2.f50968OooOOo;
            if (giftPropModel6 != null) {
                if (GiftPropModel.isMerge$default(giftPropModel6, null, 1, null)) {
                    o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.GiftMerge);
                } else if (giftPropModel6.isBlind()) {
                    o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.GiftBlind);
                } else if (giftPropModel6.isCustomMade()) {
                    o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.GiftCustomMade);
                } else {
                    o00000OO.OooOOO0(o00000oo2, GiftPropTypeTips.Default);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
