Basics:
Game runs at 60frames/s.
Horizontal speed 1.375px/frame. 
Instant acceleration
Vertical speed 4.75px/frame.
Gravity is 0.25px/frame 
if fall speed is faster than 7px/frame cap it at 7 (this number is 12 in mm1 and 2)
collision on ceiling is only checked when moving up and floor when moving down.
when MM's next frame would put him in the floor he is instead adjusted down to the pixel before contact with the floor.
