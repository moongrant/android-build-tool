package p529o0o0OO0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p517o0o0O00.o00O00;
import p528o0o0OO.OooOO0;
import p528o0o0OO.OooOO0O;
import p528o0o0OO.OooOOO0;
import p528o0o0OO.OooOo00;
import p528o0o0OO.Oooo000;
import p528o0o0OO.o000oOoO;
import p528o0o0OO.o00O0O;
import p528o0o0OO.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public OooOO0O f43138OooO00o = new OooOO0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public o00O0O f43139OooO0O0 = new o00O0O();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public o000oOoO f43140OooO0OO = new o000oOoO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public OooOO0 f43141OooO0Oo = new OooOO0();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public o0OoOo0 f43143OooO0o0 = new o0OoOo0();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public OooOo00 f43142OooO0o = new OooOo00();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public OooOOO0 f43144OooO0oO = new OooOOO0();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public Oooo000 f43145OooO0oo = new Oooo000();

    @NotNull
    public final List<String> OooO00o(@NotNull MessageIM.ReceiveReply msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.getMessagesCount() <= 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MessageIM.Message message : msg.getMessagesList()) {
            try {
                o00O00.OooO0OO("MessageDispatcher", " dispatchMessage = " + message);
                if (message.getSubType() == 1) {
                    OooOO0O oooOO0O = this.f43138OooO00o;
                    Intrinsics.checkNotNullExpressionValue(message, "message");
                    oooOO0O.OooO0Oo(message, false);
                } else {
                    Intrinsics.checkNotNullExpressionValue(message, "message");
                    OooO0O0(message);
                }
                String mid = message.getMid();
                if (mid != null) {
                    arrayList.add(mid);
                }
            } catch (Exception e) {
                e.printStackTrace();
                o00O00.OooO0o("MessageDispatcher", message.toString(), e);
            }
        }
        return arrayList;
    }

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
    public final void OooO0O0(com.app.base.protobuf.MessageIM.Message r8) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p529o0o0OO0.OooOo.OooO0O0(com.app.base.protobuf.MessageIM$Message):void");
    }
}
