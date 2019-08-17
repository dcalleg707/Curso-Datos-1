
public boolean splitArray(int[] nums) {
return help(nums, 0, 0, 0);
}

public boolean help(int[] nums, int g1, int g2, int ind)
{
if(nums.length == ind)
{
return (g1 == g2);
}
return help(nums, g1 +nums[ind], g2, ind+1) || help(nums, g1, g2+nums[ind], ind+1);
}