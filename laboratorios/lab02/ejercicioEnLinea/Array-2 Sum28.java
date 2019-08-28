public boolean sum28(int[] nums) {
  int sum = 0;
  for(int i : nums)
  {
    if(i == 2)
    {
      sum += i;
    }
  }
  return sum == 8;
}
