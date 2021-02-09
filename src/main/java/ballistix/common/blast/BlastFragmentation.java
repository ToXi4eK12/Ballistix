package ballistix.common.blast;

import ballistix.common.block.SubtypeBlast;
import ballistix.common.entity.EntityShrapnel;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlastFragmentation extends Blast {

	public BlastFragmentation(World world, BlockPos position) {
		super(world, position);
	}

	@Override
	public void doPreExplode() {
	}

	@Override
	public boolean doExplode(int callCount) {
		for (int i = 0; i < 50; i++) {
			EntityShrapnel shrapnel = new EntityShrapnel(world, 0, 0, 0);
			float yaw = world.rand.nextFloat() * 360;
			float pitch = world.rand.nextFloat() * 90 - 75;
			shrapnel.setLocationAndAngles(position.getX(), position.getY() + 1, position.getZ(), yaw, pitch);
			shrapnel.func_234612_a_(null, pitch, yaw, 0.0F, 0.5f, 0.0F);
			shrapnel.isExplosive = true;
			shrapnel.addVelocity(0, 2f, 0);
			world.addEntity(shrapnel);
		}
		return true;
	}

	@Override
	public void doPostExplode() {
	}

	@Override
	public SubtypeBlast getBlastType() {
		return SubtypeBlast.shrapnel;
	}

}
