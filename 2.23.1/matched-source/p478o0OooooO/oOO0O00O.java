package p478o0OooooO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p481o0o0000o.o000;
import p481o0o0000o.o0000O;
import p481o0o0000o.o0000OO0;
import p481o0o0000o.o000O00O;
import p481o0o0000o.o000O0O0;
import p481o0o0000o.o000O0Oo;
import p481o0o0000o.o000OO0O;
import p481o0o0000o.o000Oo0;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nIMMessageDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IMMessageDispatcher.kt\ncom/yalla/yalla/service/im/IMMessageDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
public final class oOO0O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000OO0 f48342OooO00o = new o0000OO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000O0O0 f48343OooO0O0 = new o000O0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f48344OooO0OO = new o000O0Oo();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0000O f48345OooO0Oo = new o0000O();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o000OO0O f48347OooO0o0 = new o000OO0O();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o000Oo0 f48346OooO0o = new o000Oo0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o000 f48348OooO0oO = new o000();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o000O00O f48349OooO0oo = new o000O00O();

    @NotNull
    public final ArrayList OooO00o(@NotNull MessageIM.ReceiveReply msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.getMessagesCount() <= 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MessageIM.Message message : msg.getMessagesList()) {
            try {
                OooOOOO.OooO0OO("MessageDispatcher", " dispatchMessage = " + message);
                if (message.getSubType() == 1) {
                    o0000OO0 o0000oo1 = this.f48342OooO00o;
                    Intrinsics.checkNotNull(message);
                    o0000oo1.OooO0Oo(message, false);
                } else {
                    Intrinsics.checkNotNull(message);
                    OooO0O0(message);
                }
                String mid = message.getMid();
                if (mid != null) {
                    arrayList.add(mid);
                }
            } catch (Exception e) {
                e.printStackTrace();
                OooOOOO.OooO0o0("MessageDispatcher", message.toString(), e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1060)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void OooO0O0(com.app.base.protobuf.MessageIM.Message r10) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p478o0OooooO.oOO0O00O.OooO0O0(com.app.base.protobuf.MessageIM$Message):void");
    }
}
