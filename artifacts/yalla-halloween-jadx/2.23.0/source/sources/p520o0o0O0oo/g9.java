package p520o0o0O0oo;

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
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class g9 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftSendFragment f53285OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ x6 f53286OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(x6 x6Var, GiftSendFragment giftSendFragment) {
        super(1);
        this.f53285OooO0Oo = giftSendFragment;
        this.f53286OooO0o0 = x6Var;
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
        int pageTypeUser = this.f53285OooO0Oo.getPageTypeUser();
        int value = GiftPropTypeUser.Wealth.getValue();
        x6 x6Var = this.f53286OooO0o0;
        if (pageTypeUser == value) {
            GiftPropModel giftPropModel = x6Var.f53384OooOOo;
            if (o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(GiftPropModel.isMerge$default(giftPropModel, null, 1, null)) : null)) {
                x6.OooOOOO(x6Var, GiftPropTypeTips.GiftMerge);
            } else {
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (o0OoOo0.OooO0o0(0, (Integer) o000000O.OooO0oO().getValue()) >= WealthLevel.Wealth1.getValue() || !zBooleanValue) {
                    x6.OooOOOO(x6Var, GiftPropTypeTips.Default);
                } else {
                    x6.OooOOOO(x6Var, GiftPropTypeTips.GiftTypeNotUp);
                }
            }
        } else if (pageTypeUser == GiftPropTypeUser.Flags.getValue()) {
            GiftPropModel giftPropModel2 = x6Var.f53384OooOOo;
            if (o0OoOo0.OooO00o(giftPropModel2 != null ? Boolean.valueOf(GiftPropModel.isMerge$default(giftPropModel2, null, 1, null)) : null)) {
                x6.OooOOOO(x6Var, GiftPropTypeTips.GiftMerge);
            } else if (x6Var.f53374OooO == GiftPropTypeShow.InRoom && zBooleanValue) {
                x6.OooOOOO(x6Var, GiftPropTypeTips.GiftTypeNotUp);
            } else {
                x6.OooOOOO(x6Var, GiftPropTypeTips.Default);
            }
        } else if (pageTypeUser == GiftPropTypeUser.Member.getValue()) {
            GiftPropModel giftPropModel3 = x6Var.f53384OooOOo;
            if (o0OoOo0.OooO00o(giftPropModel3 != null ? Boolean.valueOf(GiftPropModel.isMerge$default(giftPropModel3, null, 1, null)) : null)) {
                x6.OooOOOO(x6Var, GiftPropTypeTips.GiftMerge);
            } else if (OooO0O0.f24995OoooOOO.OooO00o().OooOO0O() || !zBooleanValue) {
                x6.OooOOOO(x6Var, GiftPropTypeTips.Default);
            } else {
                x6.OooOOOO(x6Var, GiftPropTypeTips.GiftTypeNotUp);
            }
        } else if (pageTypeUser == GiftPropTypeUser.Premium.getValue()) {
            GiftPropModel giftPropModel4 = x6Var.f53384OooOOo;
            if (o0OoOo0.OooO00o(giftPropModel4 != null ? Boolean.valueOf(GiftPropModel.isMerge$default(giftPropModel4, null, 1, null)) : null)) {
                x6.OooOOOO(x6Var, GiftPropTypeTips.GiftMerge);
            } else {
                o000000O o000000o3 = o000000O.f46674OooO00o;
                Pair pair = (Pair) o000000O.OooOO0o().getValue();
                if (o0OoOo0.OooO00o(pair != null ? (Boolean) pair.getFirst() : null)) {
                    PremiumLevel.Companion companion = PremiumLevel.INSTANCE;
                    Pair pair2 = (Pair) o000000O.OooOO0o().getValue();
                    if (companion.of(pair2 != null ? (Integer) pair2.getSecond() : null).getValue() > 0) {
                        x6.OooOOOO(x6Var, GiftPropTypeTips.Default);
                    } else if (zBooleanValue) {
                        x6.OooOOOO(x6Var, GiftPropTypeTips.GiftTypeNotUp);
                    } else {
                        x6.OooOOOO(x6Var, GiftPropTypeTips.Default);
                    }
                } else if (zBooleanValue) {
                    x6.OooOOOO(x6Var, GiftPropTypeTips.GiftTypeNotUp);
                } else {
                    x6.OooOOOO(x6Var, GiftPropTypeTips.Default);
                }
            }
        } else if (pageTypeUser == GiftPropTypeUser.Vip.getValue()) {
            GiftPropModel giftPropModel5 = x6Var.f53384OooOOo;
            if (o0OoOo0.OooO00o(giftPropModel5 != null ? Boolean.valueOf(GiftPropModel.isMerge$default(giftPropModel5, null, 1, null)) : null)) {
                x6.OooOOOO(x6Var, GiftPropTypeTips.GiftMerge);
            } else {
                o000000O o000000o4 = o000000O.f46674OooO00o;
                Pair pair3 = (Pair) o000000O.OooOO0().getValue();
                if (o0OoOo0.OooO0o0(0, pair3 != null ? (Integer) pair3.getSecond() : null) > 0 || !zBooleanValue) {
                    x6.OooOOOO(x6Var, GiftPropTypeTips.Default);
                } else {
                    x6.OooOOOO(x6Var, GiftPropTypeTips.GiftTypeNotUp);
                }
            }
        } else {
            GiftPropModel giftPropModel6 = x6Var.f53384OooOOo;
            if (giftPropModel6 != null) {
                if (GiftPropModel.isMerge$default(giftPropModel6, null, 1, null)) {
                    x6.OooOOOO(x6Var, GiftPropTypeTips.GiftMerge);
                } else if (giftPropModel6.isBlind()) {
                    x6.OooOOOO(x6Var, GiftPropTypeTips.GiftBlind);
                } else if (giftPropModel6.isCustomMade()) {
                    x6.OooOOOO(x6Var, GiftPropTypeTips.GiftCustomMade);
                } else {
                    x6.OooOOOO(x6Var, GiftPropTypeTips.Default);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
