package androidx.constraintlayout.core.state;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class State {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Integer f4325OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap<Object, o0OO00O.OooO00o> f4326OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap<Object, OooO0O0> f4327OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap<String, ArrayList<String>> f4328OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f4329OooO0Oo;

    public enum Chain {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public enum Constraint {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public enum Direction {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    public enum Helper {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public State() {
        HashMap<Object, o0OO00O.OooO00o> map = new HashMap<>();
        this.f4326OooO00o = map;
        this.f4327OooO0O0 = new HashMap<>();
        this.f4328OooO0OO = new HashMap<>();
        OooO00o oooO00o = new OooO00o(this);
        this.f4329OooO0Oo = oooO00o;
        map.put(f4325OooO0o0, oooO00o);
    }

    public final OooO00o OooO00o(Object obj) {
        HashMap<Object, o0OO00O.OooO00o> map = this.f4326OooO00o;
        o0OO00O.OooO00o oooO00o = map.get(obj);
        Object obj2 = oooO00o;
        if (oooO00o == null) {
            OooO00o oooO00o2 = new OooO00o(this);
            map.put(obj, oooO00o2);
            oooO00o2.f4286OooO00o = obj;
            obj2 = oooO00o2;
        }
        if (obj2 instanceof OooO00o) {
            return (OooO00o) obj2;
        }
        return null;
    }

    public int OooO0O0(Object obj) {
        throw null;
    }
}
