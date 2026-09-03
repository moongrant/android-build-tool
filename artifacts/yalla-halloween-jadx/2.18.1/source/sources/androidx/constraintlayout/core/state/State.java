package androidx.constraintlayout.core.state;

import java.util.ArrayList;
import java.util.HashMap;
import p056o0000Oo.o00000OO;

/* JADX INFO: loaded from: classes.dex */
public class State {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Integer f6885OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public HashMap<Object, o00000OO> f6886OooO00o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public HashMap<Object, OooO0O0> f6887OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public HashMap<String, ArrayList<String>> f6888OooO0OO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f6889OooO0Oo;

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
        OooO00o oooO00o = new OooO00o(this);
        this.f6889OooO0Oo = oooO00o;
        this.f6886OooO00o.put(f6885OooO0o0, oooO00o);
    }

    public final OooO00o OooO00o(Object obj) {
        o00000OO o00000oo2 = this.f6886OooO00o.get(obj);
        Object obj2 = o00000oo2;
        if (o00000oo2 == null) {
            OooO00o oooO00o = new OooO00o(this);
            this.f6886OooO00o.put(obj, oooO00o);
            oooO00o.f6846OooO00o = obj;
            obj2 = oooO00o;
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
