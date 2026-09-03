package o0O000O;

import android.content.Context;
import com.qiniu.android.http.ResponseInfo;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p276o0O000o.OooOOO0;
import p448o0OoOoOO.o0OO;
import p448o0OoOoOO.o0OO0o;
import p448o0OoOoOO.o0OO0o00;
import p448o0OoOoOO.o0OO0oO0;
import p448o0OoOoOO.o0OOO00;
import p448o0OoOoOO.o0OOO0OO;
import p448o0OoOoOO.o0OOOO00;
import p448o0OoOoOO.o0OOooO0;
import p449o0OoOoOo.o0OOo000;
import p449o0OoOoOo.o0o0000;
import p449o0OoOoOo.oO00000;
import p449o0OoOoOo.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0<IN, OUT> implements o0O000O.OooO00o<IN> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public o0OOooO0 f35060OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0OOo000.OooO00o f35061OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0OO f35062OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public String f35063OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooO0O0<IN, OUT>.OooO00o f35064OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o0OOo000 f35065OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public OooOOO0<IN> f35066OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public o0O000o0.OooO0O0<OUT> f35067OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public oO0Oo<IN> f35068OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f35069OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public CopyOnWriteArraySet<o0O000O.OooO00o.OooO0O0> f35070OooOO0o;

    public final class OooO00o extends o0o0000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public AtomicBoolean f35071OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ OooO0O0<IN, OUT> f35072OooO0O0;

        public OooO00o(OooO0O0 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f35072OooO0O0 = this$0;
            this.f35071OooO00o = new AtomicBoolean(false);
        }

        @Override // p449o0OoOoOo.o0o0000
        public final void OooO00o(@NotNull o0OOo000 connection, int i, @NotNull String reason) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(reason, "reason");
            String str = this.f35072OooO0O0.f35063OooO0Oo;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LongLink: onClosed. { instance: ");
            sbOooO0o0.append(connection.hashCode());
            sbOooO0o0.append(", state: ");
            sbOooO0o0.append(this.f35072OooO0O0.f35069OooOO0O);
            sbOooO0o0.append(", code: ");
            sbOooO0o0.append(i);
            sbOooO0o0.append(", reason: ");
            sbOooO0o0.append(reason);
            sbOooO0o0.append(", isClosed: ");
            sbOooO0o0.append(this.f35071OooO00o);
            sbOooO0o0.append(" }");
            o0O000Oo.OooO00o.OooO00o(str, sbOooO0o0.toString());
            if (this.f35071OooO00o.get()) {
                return;
            }
            OooO0O0<IN, OUT> oooO0O0 = this.f35072OooO0O0;
            synchronized (oooO0O0) {
                oooO0O0.f35069OooOO0O = 3;
                Unit unit = Unit.INSTANCE;
            }
            OooO0O0<IN, OUT> oooO0O1 = this.f35072OooO0O0;
            for (o0O000O.OooO00o.OooO0O0 oooO0O2 : oooO0O1.f35070OooOO0o) {
                oooO0O1.f35060OooO.stop();
                oooO0O2.OooO0OO(i, reason);
                oooO0O1.f35068OooOO0.OooO0Oo(connection, i);
            }
        }

        @Override // p449o0OoOoOo.o0o0000
        public final void OooO0O0(@NotNull o0OOo000 connection, int i, @NotNull String reason) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(reason, "reason");
            String str = this.f35072OooO0O0.f35063OooO0Oo;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LongLink: onClosing. { instance: ");
            sbOooO0o0.append(connection.hashCode());
            sbOooO0o0.append(", state: ");
            sbOooO0o0.append(this.f35072OooO0O0.f35069OooOO0O);
            sbOooO0o0.append(", code: ");
            sbOooO0o0.append(i);
            sbOooO0o0.append(", reason: ");
            sbOooO0o0.append(reason);
            sbOooO0o0.append(" }");
            o0O000Oo.OooO00o.OooO00o(str, sbOooO0o0.toString());
        }

        @Override // p449o0OoOoOo.o0o0000
        public final void OooO0OO(@NotNull o0OOo000 connection, @NotNull Throwable t, @Nullable String str) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(t, "t");
            String str2 = this.f35072OooO0O0.f35063OooO0Oo;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LongLink: onFailure. { instance: ");
            sbOooO0o0.append(connection.hashCode());
            sbOooO0o0.append(", state: ");
            sbOooO0o0.append(this.f35072OooO0O0.f35069OooOO0O);
            sbOooO0o0.append(", exception: ");
            sbOooO0o0.append(t);
            sbOooO0o0.append(", isClose: ");
            sbOooO0o0.append(this.f35071OooO00o);
            sbOooO0o0.append('}');
            o0O000Oo.OooO00o.OooO00o(str2, sbOooO0o0.toString());
            if (this.f35071OooO00o.get()) {
                return;
            }
            OooO0O0<IN, OUT> oooO0O0 = this.f35072OooO0O0;
            synchronized (oooO0O0) {
                oooO0O0.f35069OooOO0O = 3;
                Unit unit = Unit.INSTANCE;
            }
            if (str == null) {
                str = "";
            }
            OooO0O0<IN, OUT> oooO0O1 = this.f35072OooO0O0;
            for (o0O000O.OooO00o.OooO0O0 oooO0O2 : oooO0O1.f35070OooOO0o) {
                oooO0O1.f35060OooO.stop();
                oooO0O2.OooO0OO(ResponseInfo.TimedOut, str);
                oooO0O2.OooO0o0(t, ResponseInfo.TimedOut, str);
                oooO0O1.f35068OooOO0.OooO0Oo(connection, ResponseInfo.TimedOut);
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p449o0OoOoOo.o0o0000
        public final void OooO0Oo(@NotNull o0OOo000 connection, @NotNull String text) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(text, "text");
            OooO0O0<IN, OUT> oooO0O0 = this.f35072OooO0O0;
            if (oooO0O0.f35069OooOO0O != 2) {
                String str = oooO0O0.f35063OooO0Oo;
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LongLink: onMessage. { instance: ");
                sbOooO0o0.append(connection.hashCode());
                sbOooO0o0.append(", Text Message: ");
                sbOooO0o0.append(text);
                sbOooO0o0.append(", isClose: ");
                sbOooO0o0.append(this.f35071OooO00o);
                sbOooO0o0.append(" }");
                o0O000Oo.OooO00o.OooO00o(str, sbOooO0o0.toString());
            } else {
                String str2 = oooO0O0.f35063OooO0Oo;
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("LongLink: onMessage. { instance: ");
                sbOooO0o1.append(connection.hashCode());
                sbOooO0o1.append(", state: ");
                sbOooO0o1.append(this.f35072OooO0O0.f35069OooOO0O);
                sbOooO0o1.append(", isClosed: ");
                sbOooO0o1.append(this.f35071OooO00o);
                sbOooO0o1.append('}');
                o0O000Oo.OooO00o.OooO0O0(str2, sbOooO0o1.toString());
            }
            if (this.f35071OooO00o.get()) {
                return;
            }
            o0O000o0.OooO0O0<OUT> oooO0O1 = this.f35072OooO0O0.f35067OooO0oo;
            byte[] bytes = text.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            oooO0O1.OooO00o(bytes);
        }

        @Override // p449o0OoOoOo.o0o0000
        public final void OooO0o(@NotNull o0OOo000 connection, int i, @NotNull String message) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(message, "message");
            if (this.f35071OooO00o.get()) {
                return;
            }
            boolean z = i == 100;
            OooO0O0<IN, OUT> oooO0O0 = this.f35072OooO0O0;
            synchronized (oooO0O0) {
                if (oooO0O0.f35069OooOO0O == 1 && z) {
                    oooO0O0.f35069OooOO0O = 2;
                    oooO0O0.f35065OooO0o0 = connection;
                    oooO0O0.f35062OooO0OO.OooO0Oo();
                    oooO0O0.f35060OooO.start();
                }
                Unit unit = Unit.INSTANCE;
            }
            if (z) {
                o0O000Oo.OooO00o.OooO00o(this.f35072OooO0O0.f35063OooO0Oo, "LongLink: open successful!");
                OooO0O0<IN, OUT> oooO0O1 = this.f35072OooO0O0;
                Iterator<o0O000O.OooO00o.OooO0O0> it = oooO0O1.f35070OooOO0o.iterator();
                while (it.hasNext()) {
                    it.next().OooO0Oo();
                    oooO0O1.f35068OooOO0.f40305OoooO00 = 0;
                }
                return;
            }
            String str = this.f35072OooO0O0.f35063OooO0Oo;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LongLink: open failure! { instance: ");
            sbOooO0o0.append(connection.hashCode());
            sbOooO0o0.append(", state: ");
            sbOooO0o0.append(this.f35072OooO0O0.f35069OooOO0O);
            sbOooO0o0.append(", code: ");
            sbOooO0o0.append(i);
            sbOooO0o0.append(", message: ");
            sbOooO0o0.append(message);
            sbOooO0o0.append(" }");
            o0O000Oo.OooO00o.OooO00o(str, sbOooO0o0.toString());
            OooO0O0<IN, OUT> oooO0O2 = this.f35072OooO0O0;
            Iterator<o0O000O.OooO00o.OooO0O0> it2 = oooO0O2.f35070OooOO0o.iterator();
            while (it2.hasNext()) {
                it2.next().OooO0o0(new Throwable("LongLink connection failed"), i, message);
                oooO0O2.f35068OooOO0.OooO0Oo(connection, i);
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p449o0OoOoOo.o0o0000
        public final void OooO0o0(@NotNull o0OOo000 connection, @NotNull byte[] bytes) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            OooO0O0<IN, OUT> oooO0O0 = this.f35072OooO0O0;
            if (oooO0O0.f35069OooOO0O != 2) {
                String str = oooO0O0.f35063OooO0Oo;
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LongLink: onMessage. { instance: ");
                sbOooO0o0.append(connection.hashCode());
                sbOooO0o0.append(", Byte Message Size: ");
                sbOooO0o0.append(bytes.length);
                sbOooO0o0.append(", isClose: ");
                sbOooO0o0.append(this.f35071OooO00o);
                sbOooO0o0.append(" }");
                o0O000Oo.OooO00o.OooO00o(str, sbOooO0o0.toString());
            } else {
                String str2 = oooO0O0.f35063OooO0Oo;
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("LongLink: onMessage. { instance: ");
                sbOooO0o1.append(connection.hashCode());
                sbOooO0o1.append(", state: ");
                sbOooO0o1.append(this.f35072OooO0O0.f35069OooOO0O);
                sbOooO0o1.append(", isClosed: ");
                sbOooO0o1.append(this.f35071OooO00o);
                sbOooO0o1.append('}');
                o0O000Oo.OooO00o.OooO0O0(str2, sbOooO0o1.toString());
            }
            if (this.f35071OooO00o.get()) {
                return;
            }
            this.f35072OooO0O0.f35067OooO0oo.OooO00o(bytes);
        }
    }

    /* JADX INFO: renamed from: o0O000O.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0356OooO0O0 extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0<IN, OUT> f35073Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0356OooO0O0(OooO0O0<IN, OUT> oooO0O0) {
            super(1);
            this.f35073Oooo0o = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            this.f35073Oooo0o.OooO00o(num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements o0OO0oO0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0<IN, OUT> f35074OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o0OO0oO0 f35075OooO0O0;

        public OooO0OO(OooO0O0<IN, OUT> oooO0O0, o0OO0oO0 o0oo0oo1) {
            this.f35074OooO00o = oooO0O0;
            this.f35075OooO0O0 = o0oo0oo1;
        }

        @Override // o0OoOoOO.o0OO0oO0.OooO00o
        public final void OooO00o() {
            OooO0O0<IN, OUT> oooO0O0 = this.f35074OooO00o;
            o0OOo000 o0ooo001 = oooO0O0.f35065OooO0o0;
            if (o0ooo001 != null) {
                o0ooo001.OooOO0o(4000, "Pulse timeout!");
                OooO0O0<IN, OUT>.OooO00o oooO00o = oooO0O0.f35064OooO0o;
                if (oooO00o != null) {
                    oooO00o.OooO0OO(o0ooo001, new IllegalStateException("Pulse timeout!"), "");
                }
            }
            this.f35075OooO0O0.stop();
            o0O000Oo.OooO00o.OooO00o(this.f35074OooO00o.f35063OooO0Oo, "Pulse timeout!");
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0<IN, OUT> f35076Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(OooO0O0<IN, OUT> oooO0O0) {
            super(0);
            this.f35076Oooo0o = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.f35076Oooo0o.f35069OooOO0O);
        }
    }

    public OooO0O0(@NotNull Context context, @NotNull OooOO0<IN, OUT> protocol, @NotNull OooO<OUT> messageHandler, @NotNull o0OOo000.OooO00o connectionFactory, @NotNull oO00000 reconnectionConfig, @NotNull o0OO pulseAdapter) {
        o0OOooO0 o0oo0o01;
        o0OOooO0 o0oo0o2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        Intrinsics.checkNotNullParameter(reconnectionConfig, "reconnectionConfig");
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        this.f35061OooO0O0 = connectionFactory;
        this.f35062OooO0OO = pulseAdapter;
        this.f35063OooO0Oo = String.valueOf(Reflection.getOrCreateKotlinClass(protocol.getClass()).getSimpleName());
        if (o0O000O.OooO0o.f35079OooO00o == null || !CoroutineScopeKt.isActive(o0O000O.OooO0o.OooO00o())) {
            o0O000O.OooO0OO oooO0OO = new o0O000O.OooO0OO(null);
            Intrinsics.checkNotNullParameter(oooO0OO, "<set-?>");
            o0O000O.OooO0o.f35079OooO00o = oooO0OO;
        }
        this.f35066OooO0oO = new OooOOO0<>(protocol, new OooO0o(this));
        o0O000o0.OooO0o receiver = new o0O000o0.OooO0o(protocol, messageHandler);
        this.f35067OooO0oo = receiver;
        OooOOO0<IN> sender = this.f35066OooO0oO;
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        int i = o0OOO00.$EnumSwitchMapping$0[pulseAdapter.OooO0OO().ordinal()];
        if (i != 1) {
            if (i == 2) {
                o0oo0o01 = new o0OOO0OO(pulseAdapter, sender, receiver, protocol);
            } else if (i == 3) {
                o0oo0o2 = new o0OO0o(pulseAdapter, sender, protocol);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                o0oo0o2 = new o0OOOO00(pulseAdapter, receiver);
            }
            OooO0OO listener = new OooO0OO(this, o0oo0o2);
            Intrinsics.checkNotNullParameter(listener, "listener");
            o0oo0o2.f40295OooO0O0 = listener;
            this.f35060OooO = o0oo0o2;
            this.f35068OooOO0 = new oO0Oo<>(context, this, reconnectionConfig, new C0356OooO0O0(this));
            this.f35067OooO0oo.run();
            this.f35070OooOO0o = new CopyOnWriteArraySet<>();
        }
        o0oo0o01 = new o0OO0o00(pulseAdapter, sender, receiver, protocol);
        o0oo0o2 = o0oo0o01;
        OooO0OO listener2 = new OooO0OO(this, o0oo0o2);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        o0oo0o2.f40295OooO0O0 = listener2;
        this.f35060OooO = o0oo0o2;
        this.f35068OooOO0 = new oO0Oo<>(context, this, reconnectionConfig, new C0356OooO0O0(this));
        this.f35067OooO0oo.run();
        this.f35070OooOO0o = new CopyOnWriteArraySet<>();
    }

    public final synchronized void OooO00o(int i) {
        o0OOo000 o0ooo001;
        o0O000Oo.OooO00o.OooO00o(this.f35063OooO0Oo, Intrinsics.stringPlus("Request close longlink, longlink state is ", Integer.valueOf(this.f35069OooOO0O)));
        int i2 = this.f35069OooOO0O;
        if ((i2 == 2 || i2 == 1) && (o0ooo001 = this.f35065OooO0o0) != null) {
            o0ooo001.OooOO0o(1000, "Longlink closed by outside");
        }
        OooO0O0<IN, OUT>.OooO00o oooO00o = this.f35064OooO0o;
        if (oooO00o != null) {
            oooO00o.f35071OooO00o.set(true);
        }
        this.f35067OooO0oo.close();
        this.f35068OooOO0.close();
        this.f35060OooO.stop();
        this.f35069OooOO0O = 4;
        Iterator<o0O000O.OooO00o.OooO0O0> it = this.f35070OooOO0o.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(i);
        }
        if (o0O000O.OooO0o.f35079OooO00o != null) {
            CoroutineScopeKt.cancel$default(o0O000O.OooO0o.OooO00o(), null, 1, null);
        }
    }

    @Override // o0O000O.OooO00o
    @Nullable
    public final o0OOo000 OooO0O0() {
        return this.f35065OooO0o0;
    }

    @Override // o0O000O.OooO00o
    @NotNull
    public final String OooO0OO() {
        return this.f35063OooO0Oo;
    }

    public final void OooO0Oo(@NotNull o0O000O.OooO00o.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f35070OooOO0o.remove(callback);
    }

    @Override // o0O000O.OooO00o
    public final synchronized void open() {
        o0O000Oo.OooO00o.OooO00o(this.f35063OooO0Oo, Intrinsics.stringPlus("Request start connect, longlink state is ", Integer.valueOf(this.f35069OooOO0O)));
        int i = this.f35069OooOO0O;
        if (i == 0 || i == 3) {
            o0OOo000 o0ooo001 = this.f35065OooO0o0;
            if (o0ooo001 != null) {
                o0ooo001.OooOO0o(1000, "WebSocket is not null, so cancel and close it!");
            }
            OooO0O0<IN, OUT>.OooO00o oooO00o = this.f35064OooO0o;
            if (oooO00o != null) {
                oooO00o.f35071OooO00o.set(true);
            }
            this.f35069OooOO0O = 1;
            OooO0O0<IN, OUT>.OooO00o oooO00o2 = new OooO00o(this);
            o0OOo000 o0ooo000OooO00o = this.f35061OooO0O0.OooO00o();
            o0ooo000OooO00o.OooOOO0(oooO00o2);
            this.f35064OooO0o = oooO00o2;
            this.f35065OooO0o0 = o0ooo000OooO00o;
            OooOOO0<IN> oooOOO0 = this.f35066OooO0oO;
            Objects.requireNonNull(oooOOO0);
            Intrinsics.checkNotNullParameter(o0ooo000OooO00o, "<set-?>");
            oooOOO0.f35085OooO0OO = o0ooo000OooO00o;
            o0ooo000OooO00o.open();
            Iterator<T> it = this.f35070OooOO0o.iterator();
            while (it.hasNext()) {
                ((o0O000O.OooO00o.OooO0O0) it.next()).OooO0O0();
            }
        }
    }
}
