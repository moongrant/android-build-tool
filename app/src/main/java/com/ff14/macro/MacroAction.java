package com.ff14.macro;

/**
 * 宏操作基类
 */
public abstract class MacroAction {

    public enum Type {
        TAP,    // 点击
        SWIPE,  // 滑动
        DELAY   // 延迟
    }

    protected Type type;

    public Type getType() {
        return type;
    }

    /**
     * 点击操作
     */
    public static class TapAction extends MacroAction {
        public int x;
        public int y;

        public TapAction(int x, int y) {
            this.type = Type.TAP;
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "tap," + x + "," + y;
        }
    }

    /**
     * 滑动操作
     */
    public static class SwipeAction extends MacroAction {
        public int startX;
        public int startY;
        public int endX;
        public int endY;
        public long duration;

        public SwipeAction(int startX, int startY, int endX, int endY, long duration) {
            this.type = Type.SWIPE;
            this.startX = startX;
            this.startY = startY;
            this.endX = endX;
            this.endY = endY;
            this.duration = duration;
        }

        @Override
        public String toString() {
            return "swipe," + startX + "," + startY + "," + endX + "," + endY + "," + duration;
        }
    }

    /**
     * 延迟操作
     */
    public static class DelayAction extends MacroAction {
        public long delayMs;

        public DelayAction(long delayMs) {
            this.type = Type.DELAY;
            this.delayMs = delayMs;
        }

        @Override
        public String toString() {
            return "delay," + delayMs;
        }
    }

    /**
     * 从字符串解析操作
     */
    public static MacroAction parse(String line) {
        String[] parts = line.trim().split(",");
        if (parts.length < 2) return null;

        try {
            switch (parts[0].toLowerCase()) {
                case "tap":
                    if (parts.length >= 3) {
                        return new TapAction(
                            Integer.parseInt(parts[1].trim()),
                            Integer.parseInt(parts[2].trim())
                        );
                    }
                    break;
                case "swipe":
                    if (parts.length >= 6) {
                        return new SwipeAction(
                            Integer.parseInt(parts[1].trim()),
                            Integer.parseInt(parts[2].trim()),
                            Integer.parseInt(parts[3].trim()),
                            Integer.parseInt(parts[4].trim()),
                            Long.parseLong(parts[5].trim())
                        );
                    }
                    break;
                case "delay":
                    return new DelayAction(Long.parseLong(parts[1].trim()));
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return null;
    }
}
